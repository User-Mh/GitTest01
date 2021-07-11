package service;
import entity.File;
/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @version 1.0
 * @author: LvFeng
 * @Date: 2021-07-10
 * @Time: 17:11
 */
public interface FileService
{

    File selectByPrimaryKey(Integer id);
}
