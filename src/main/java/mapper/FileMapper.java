package mapper;
import entity.File;
/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @version 1.0
 * @author: LvFeng
 * @Date: 2021-07-10
 * @Time: 17:08
 */
public interface FileMapper
{
    File selectByPrimaryKey(Integer id);

}
