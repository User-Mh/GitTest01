package service.impl;

import mapper.FileMapper;
import org.springframework.stereotype.Service;
import service.FileService;
import entity.File;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @version 1.0
 * @author: LvFeng
 * @Date: 2021-07-10
 * @Time: 17:12
 */
@Service
public class FileServiceImpl implements FileService
{
    @Resource
    private FileMapper fileMapper;
    @Override
    public File selectByPrimaryKey(Integer id) {
        return fileMapper.selectByPrimaryKey(id);
    }
}
