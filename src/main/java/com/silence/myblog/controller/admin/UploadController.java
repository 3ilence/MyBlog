package com.silence.myblog.controller.admin;

import com.silence.myblog.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName : UploadController
 * @Author : Silence
 * @Date: 2021/6/19 21:27
 * @Description :
 */
@Controller
@RequestMapping("/admin")
public class UploadController {
    @PostMapping("/upload/file")
    @ResponseBody
    public Result upload(HttpServletRequest request, @RequestParam("files") MultipartFile file) {
        String fileName = file.getOriginalFilename();
        
    }
}
