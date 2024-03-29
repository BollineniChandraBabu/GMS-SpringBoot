package com.revature.GradeManagementSystemapi.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.revature.GradeManagementSystemapi.exception.ServiceException;
import com.revature.GradeManagementSystemapi.model.Marks;
import com.revature.GradeManagementSystemapi.model.Students;
import com.revature.GradeManagementSystemapi.model.Subjects;
import com.revature.GradeManagementSystemapi.services.impl.MarksServicesImpl;

@RestController
public class MarksController {
	@Autowired
	MarksServicesImpl marksServices;

	@GetMapping("viewtop")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Marks> findMaxMarks()  {
		return marksServices.findMaxMarks();
	}

	@GetMapping("viewallmarks")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Marks> viewAllMarks(){
		return marksServices.viewAllMarks();
	}

	@GetMapping("insertMarks")
	@ResponseStatus(code = HttpStatus.OK)
	public boolean insertOrUpdate(@RequestParam("id") int regno, @RequestParam("subjectdetails") int sid,
			@RequestParam("marks") int mark) throws ServiceException, SQLIntegrityConstraintViolationException {
		Marks marks = new Marks();
		Students student = new Students();
		student.setRegistrationNumber(regno);
		marks.setStudent(student);
		Subjects subjects = new Subjects();
		subjects.setId(sid);
		marks.setSubjects(subjects);
		marks.setMarks(mark);
		boolean result= marksServices.insertOrUpdate(marks);
		System.out.println("result:"+result);
		return result;
	}

	@GetMapping("viewBySubjectCode")
	@ResponseStatus(code = HttpStatus.OK)
	public Object viewBySubjectCode(@RequestParam("subjectdetails") int subjectCode) {
		return marksServices.viewBySubjectCode(subjectCode);
	}

	@GetMapping("viewBySubjectName")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Marks> viewBySubjectName(@RequestParam("subjectdetails") String subjectName) {
		return marksServices.viewBySubjectName(subjectName);

	}

	@GetMapping("viewByGrade")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Marks> getMarksByGrade(@RequestParam("grade") String grade) throws ServiceException {
		return marksServices.viewMarksByGrade(grade);

	}

	@GetMapping("viewStudentMarks")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Marks> viewStudentMarks(@RequestParam("studentid") int studentid) {
		return marksServices.viewStudentMarks(studentid);
	}

	@GetMapping("viewBySubject")
	@ResponseStatus(code = HttpStatus.OK)
	public Object viewBySubject(@RequestParam("subjectdetails") String subjectdetails) throws ServiceException {
		Object result = null;
		try {

			int subject = Integer.parseInt(subjectdetails);
			result = viewBySubjectCode(subject);

		} catch (NumberFormatException nfe) {
			try {
				result = viewBySubjectName(subjectdetails);
			} catch (Exception e) {
				throw new ServiceException("Subject Not Available");
			}
		}
		return result;
	}
}
