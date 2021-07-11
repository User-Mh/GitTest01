package util;

import java.sql.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.File;
import org.springframework.jdbc.support.JdbcUtils;

/**
 * Created with IntelliJ IDEA.
 * Description:测试查询数据
 *
 * @version 1.0
 * @author: LvFeng
 * @Date: 2021-07-10
 * @Time: 19:55
 */
public class SelectUserById
{
    public static void main(String[] args){
        Connection connection=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;

        try
        {
            //1连接数据库
            Class.forName("com.mysql.jdbc.Driver");

            // 使用的技术：数据库名：//ip:mysql端口/数据库名字

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mark", "root", "12345678");


            new SelectUserById().single(connection,pstm,rs);
            new SelectUserById().List(connection,pstm,rs);

        }catch (SQLException | ClassNotFoundException a){
            a.printStackTrace();
        }finally {
            //7.关闭
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(pstm);
            JdbcUtils.closeConnection(connection);

        }

    }

    //查询单条数据
    public void single(Connection connection,PreparedStatement pstm,ResultSet rs)
    {
        try {

            //2.编写？sql

            String sql ="select * from file where id=1 ";
            //3.预编译

            pstm = connection.prepareStatement(sql);

            //4.填充占位符
            //pstm.setObject(1,"1");

            //5.执行
            rs = pstm.executeQuery();

            //6判断是否有值，然后打印
            if(rs.next()){
                /*int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
*/
                int id = rs.getInt("id");
                String filename = rs.getString("filename");
                String fileurl = rs.getString("fileurl");
                int isdel = rs.getInt("isdel");
                File user  = new File(id,filename,fileurl,isdel);
                System.out.println(user.toString());

                System.out.println("id:"+id+",name:"+filename+",age"+fileurl);

            }

        } catch (SQLException  e) {
            e.printStackTrace();
        }
    }

    /**
     *  * Created with IntelliJ IDEA.
     *  * Description:查询多条数据
     *
     */
    public void  List(Connection connection,PreparedStatement pstm, ResultSet rs)
    {
        try {

            //2.编写？sql

            String sql ="select * from file ";
            //3.预编译

            pstm = connection.prepareStatement(sql);

            //4.填充占位符
            //pstm.setObject(1,"1");

            //5.执行
            rs = pstm.executeQuery();

            //6判断是否有值，然后打印
            if(rs.next()){
                /*int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
*/
                int id = rs.getInt("id");
                String filename = rs.getString("filename");
                String fileurl = rs.getString("fileurl");
                int isdel = rs.getInt("isdel");
                File user  = new File(id,filename,fileurl,isdel);
                System.out.println(user.toString());

                System.out.println("id:"+id+",name:"+filename+",age"+fileurl);

            }

        } catch (SQLException  e) {
            e.printStackTrace();
        }
    }


}
