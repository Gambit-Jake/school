package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.FileReader;
@Controller
public class IndexControllerImpl implements IndexController
{
    @Override
    @RequestMapping("/student/index")
    public String theIndex(Model model) {
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader("D:\\school\\school\\src\\main\\java\\com\\school\\files\\message.txt"));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        model.addAttribute("message",result.toString());

        return "/student/Index";
    }

    @Override
    public String theIndex2(Model model) {
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader("D:\\school\\school\\src\\main\\java\\com\\school\\files\\message.txt"));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        model.addAttribute("message",result.toString());

        return "/student/Index2";


    }
}
