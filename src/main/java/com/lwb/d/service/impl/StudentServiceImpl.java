package com.lwb.d.service.impl;

import com.lwb.d.entity.Student;
import com.lwb.d.mapper.StudentMapper;
import com.lwb.d.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 学生表 服务实现类
 * @author lwb
 * @date 2019/07/27
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}