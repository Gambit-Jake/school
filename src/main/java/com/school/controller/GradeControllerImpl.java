package com.school.controller;

import com.school.dao.CourseDao;
import com.school.entity.Stugrade;
import com.school.entity.StugradeDTO;
import com.school.service.ExtraWebsiteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
@Controller
public class GradeControllerImpl implements GradeController{
    @Resource(name = "extraWebsiteService")
    ExtraWebsiteService extraWebsiteService;
    @Resource(name = "courseDao")
    CourseDao courseDao;

    @Override
    @RequestMapping("/student/grade")
    public String showgrade(HttpSession httpSession, Model model) {
        httpSession.setAttribute("STUDENT_ID", 2);
        Integer ID = (Integer) httpSession.getAttribute("STUDENT_ID");
         Stugrade stugrade=extraWebsiteService.QueryStugrade(ID);

       List<Float> score=new ArrayList();
        score.add(stugrade.getOperating_system());
        score.add(stugrade.getData_structure());
        score.add(stugrade.getMath());
        score.add(stugrade.getPhysics());
        score.add(stugrade.getJava());
        score.add(stugrade.getPython());


        List<StugradeDTO> stugradeDTOList =new ArrayList<StugradeDTO>();
        for (int i=1;i<=6;i++){
            StugradeDTO stugradeDTO =new StugradeDTO();
            stugradeDTO.setStu_id(ID);
            stugradeDTO.setCourse_id(i);
            stugradeDTO.setCourse_name(courseDao.findCourseById(i).getCourse_name());
            stugradeDTO.setCourse_type(courseDao.findCourseById(i).getCourse_type());
            stugradeDTO.setCredit(courseDao.findCourseById(i).getCredit());
            stugradeDTO.setTerm(courseDao.findCourseById(i).getTerm());
            stugradeDTO.setScore(score.get(i-1));
            stugradeDTOList.add(stugradeDTO);

        }
        model.addAttribute("list",stugradeDTOList);





        return "/student/Grade";
    }
}
