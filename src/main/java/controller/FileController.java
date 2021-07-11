package controller;

import entity.File;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import service.FileService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @version 1.0
 * @author: LvFeng
 * @Date: 2021-07-10
 * @Time: 17:14
 */
@Controller
@RequestMapping("/file")
public class FileController
{
    @Resource
    private FileService fileService;

    @RequestMapping("getDataById")
    public String getDataById(HttpServletRequest request){
        Integer id = 1;
        File file = fileService.selectByPrimaryKey(id);
        request.setAttribute("files",file);
        return "show";
    }

     /**

    @RequestMapping("listFile")
    public List<File> listFile(HttpServletRequest req){


        return List<File>;
    }
    */
}

