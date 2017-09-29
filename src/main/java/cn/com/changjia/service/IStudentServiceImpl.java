package cn.com.changjia.service;

import cn.com.changjia.dao.IStudentDao;
import cn.com.changjia.dbbean.Student;

public class IStudentServiceImpl implements IStudentService
{
    IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student) {
         dao.insertStudent(student);
    }
}
