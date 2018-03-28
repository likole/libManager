package org.libM.web;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.annotation.MultipartConfig;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
@MultipartConfig(location="/tmp", fileSizeThreshold=1024*1024, maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)
public class fileUpload {


    @RequestMapping("/image")
    @ResponseBody
    public String upload(MultipartFile file)throws IOException{

        try {
            //String path=request.getSession().getServletContext().getRealPath("/images");
            String path="/home/kang/IdeaProjects/images";
            System.out.println("path:"+path);

            String originName=file.getOriginalFilename();
            System.out.println(originName);

            File dir=new File(path+"/"+originName);
            if(!dir.exists()){
                file.transferTo(dir);
            }
            System.out.println("dir.exists()>>"+dir.exists());
            //MultipartFile自带的解析方法
            //file.transferTo(dir);

            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "failed";
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return "failed";
        }
    }

}
