package entity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @version 1.0
 * @author: LvFeng
 * @Date: 2021-07-10
 * @Time: 16:50
 */
public class File<T>
{
    private  Integer id;

    private  String filename;

    private  String fileurl;

    private  Integer isdel;

    private List<T> pages;

    public File(){

    }

    public List<T> getPages()
    {
        return pages;
    }

    public void setPages(List<T> pages)
    {
        this.pages = pages;
    }

    public File(int id, String filename, String fileurl, int isdel)
    {
        setId(id);
        setFilename(filename);
        setFileurl(fileurl);
        setIsdel(isdel);
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    public void setFileurl(String fileurl)
    {
        this.fileurl = fileurl;
    }

    public void setIsdel(Integer isdel)
    {
        this.isdel = isdel;
    }

    public Integer getId()
    {
        return id;
    }

    public String getFilename()
    {
        return filename;
    }

    public String getFileurl()
    {
        return fileurl;
    }

    public Integer getIsdel()
    {
        return isdel;
    }
}
