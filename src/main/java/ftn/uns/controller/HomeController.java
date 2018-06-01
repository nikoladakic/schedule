package ftn.uns.controller;


import ftn.uns.model.*;
import ftn.uns.model.enums.OS;
import ftn.uns.model.settings.ClassroomsSettings;
import ftn.uns.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by daka on 5/8/18.
 */

@RestController
@RequestMapping("/api/home")
public class HomeController {


    @Autowired
    CourseRepository courseRepository;

    @Autowired
    TimePeriodRepository timePeriodRepository;

    @Autowired
    ClassroomsRepository classroomsRepository;

    @Autowired
    DayRepository dayRepository;

    @Autowired
    ClassroomsSettingsRepository classroomsSettingsRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @RequestMapping("/insertData")
    public ResponseEntity populateData() throws Exception{

        List<Course> courseList = courseRepository.findAll();

        if(courseList.isEmpty()){
            System.out.println("Populate Course");

            Department siit = new Department("SIIT", "Softversko Inzenjersvo i Informacione Tehnologije", "#18fff5");
            Department e2 = new Department("E2", "Racunarstvo i Automatika", "#fff722");

            departmentRepository.save(siit);
            departmentRepository.save(e2);

            Course course1 = new Course("HCI-SIIT", "HCI", "Iterakcija Covek Racunar", 45, siit, OS.cross);
            Course course2 = new Course("PP-SIIT", "PP","Programski Prevodioci", 90, siit, OS.linux);
            Course course3 = new Course("NTP-SIIT", "NTP", "Napredne Tehnike Programiranja", 45, siit, OS.linux);
            Course course4 = new Course("OS-SIIT", "OS","Operativni Sistemi", 45, siit, OS.linux);
            Course course5 = new Course("OP-SIIT", "OP","Organizacija Podataka", 90, siit, OS.windows);
            Course course6 = new Course("WEB-SIIT", "WEB","Web Programiranje", 45, siit, OS.linux);
            Course course7 = new Course("MU-SIIT", "MU","Masinsko Ucenje", 90, siit, OS.linux);

            Course course8 = new Course("HCI-E2", "HCI","Iterakcija Covek Racunar", 45, e2, OS.cross);
            Course course9 = new Course("PP-E2", "PP","Programski Prevodioci", 45, e2, OS.linux);
            Course course10 = new Course("NTP-E2", "NTP","Napredne Tehnike Programiranja", 45, e2, OS.linux);
            Course course11 = new Course("OS-E2", "OS","Operativni Sistemi", 45, e2, OS.linux);
            Course course12 = new Course("OP-E2", "OP","Organizacija Podataka", 45, e2, OS.windows);
            Course course13 = new Course("WEB-E2", "WEB","Web Programiranje", 45, e2, OS.windows);
            Course course14 = new Course("MU-E2", "MU","Masinsko Ucenje", 45, e2, OS.windows);

            courseRepository.save(course1);
            courseRepository.save(course2);
            courseRepository.save(course3);
            courseRepository.save(course4);
            courseRepository.save(course5);
            courseRepository.save(course6);
            courseRepository.save(course7);
            courseRepository.save(course8);
            courseRepository.save(course9);
            courseRepository.save(course10);
            courseRepository.save(course11);
            courseRepository.save(course12);
            courseRepository.save(course13);
            courseRepository.save(course14);


            TimePeriod timePeriod1 = new TimePeriod("7:00", 1, 5, null);
            TimePeriod timePeriod2 = new TimePeriod("7:15", 2, 5, null);
            TimePeriod timePeriod3 = new TimePeriod("7:30", 3, 5, null);
            TimePeriod timePeriod4 = new TimePeriod("7:45", 4, 5, null);
            TimePeriod timePeriod5 = new TimePeriod("8:00", 5, 5, null);
            TimePeriod timePeriod6 = new TimePeriod("8:15", 6, 5, null);
            TimePeriod timePeriod7 = new TimePeriod("8:30", 7, 5, null);
            TimePeriod timePeriod8 = new TimePeriod("8:45", 8, 5, null);
            TimePeriod timePeriod9 = new TimePeriod("9:00", 9, 5, null);
            TimePeriod timePeriod10 = new TimePeriod("9:15", 10, 5, null);
            TimePeriod timePeriod11 = new TimePeriod("9:30", 11, 5, null);
            TimePeriod timePeriod12 = new TimePeriod("9:45", 12, 5, null);
            TimePeriod timePeriod13 = new TimePeriod("10:00", 13, 5, null);
            TimePeriod timePeriod14 = new TimePeriod("10:15", 14, 5, null);
            TimePeriod timePeriod15 = new TimePeriod("10:30", 15, 5, null);
            TimePeriod timePeriod16 = new TimePeriod("10:45", 16, 5, null);
            TimePeriod timePeriod18 = new TimePeriod("11:00", 17, 5, null);
            TimePeriod timePeriod19 = new TimePeriod("11:15", 18, 5, null);
            TimePeriod timePeriod20 = new TimePeriod("11:30", 19, 5, null);
            TimePeriod timePeriod21 = new TimePeriod("11:45", 20, 5, null);
            TimePeriod timePeriod22 = new TimePeriod("12:00", 21, 5, null);
            TimePeriod timePeriod23 = new TimePeriod("12:15", 22, 5, null);
            TimePeriod timePeriod24 = new TimePeriod("12:30", 23, 5, null);
            TimePeriod timePeriod25 = new TimePeriod("12:45", 24, 5, null);
            TimePeriod timePeriod26 = new TimePeriod("13:00", 25, 5, null);
            TimePeriod timePeriod27 = new TimePeriod("13:15", 26, 5, null);
            TimePeriod timePeriod28 = new TimePeriod("13:30", 27, 5, null);
            TimePeriod timePeriod29 = new TimePeriod("13:45", 28, 5, null);
            TimePeriod timePeriod30 = new TimePeriod("14:00", 29, 5, null);
            TimePeriod timePeriod31 = new TimePeriod("14:15", 30, 5, null);
            TimePeriod timePeriod32 = new TimePeriod("14:30", 31, 5, null);
            TimePeriod timePeriod33 = new TimePeriod("14:45", 32, 5, null);
            TimePeriod timePeriod34 = new TimePeriod("15:00", 33, 5, null);
            TimePeriod timePeriod35 = new TimePeriod("15:15", 34, 5, null);
            TimePeriod timePeriod36 = new TimePeriod("15:30", 35, 5, null);
            TimePeriod timePeriod37 = new TimePeriod("15:45", 36, 5, null);
            TimePeriod timePeriod38 = new TimePeriod("16:00", 37, 5, null);
            TimePeriod timePeriod39 = new TimePeriod("16:15", 38, 5, null);
            TimePeriod timePeriod40 = new TimePeriod("16:30", 39, 5, null);
            TimePeriod timePeriod41 = new TimePeriod("16:45", 40, 5, null);
            TimePeriod timePeriod42 = new TimePeriod("17:00", 41, 5, null);
            TimePeriod timePeriod43 = new TimePeriod("17:15", 42, 5, null);
            TimePeriod timePeriod44 = new TimePeriod("17:30", 43, 5, null);
            TimePeriod timePeriod45 = new TimePeriod("17:45", 44, 5, null);
            TimePeriod timePeriod46 = new TimePeriod("18:00", 45, 5, null);
            TimePeriod timePeriod47 = new TimePeriod("18:15", 46, 5, null);
            TimePeriod timePeriod48 = new TimePeriod("18:30", 47, 5, null);
            TimePeriod timePeriod49 = new TimePeriod("18:45", 48, 5, null);
            TimePeriod timePeriod50 = new TimePeriod("19:00", 49, 5, null);
            TimePeriod timePeriod51 = new TimePeriod("19:15", 50, 5, null);
            TimePeriod timePeriod52 = new TimePeriod("19:30", 51, 5, null);
            TimePeriod timePeriod53 = new TimePeriod("19:45", 52, 5, null);
            TimePeriod timePeriod54 = new TimePeriod("20:00", 53, 5, null);
            TimePeriod timePeriod55 = new TimePeriod("20:15", 54, 5, null);
            TimePeriod timePeriod56 = new TimePeriod("20:30", 55, 5, null);
            TimePeriod timePeriod57 = new TimePeriod("20:45", 56, 5, null);
            TimePeriod timePeriod58 = new TimePeriod("21:00", 57, 5, null);
            TimePeriod timePeriod59 = new TimePeriod("21:15", 58, 5, null);
            TimePeriod timePeriod60 = new TimePeriod("21:30", 59, 5, null);
            TimePeriod timePeriod61 = new TimePeriod("21:45", 60, 5, null);


            List<TimePeriod> period = new ArrayList<>();

            period.add(timePeriod1);
            period.add(timePeriod2);
            period.add(timePeriod3);
            period.add(timePeriod4);
            period.add(timePeriod5);
            period.add(timePeriod6);
            period.add(timePeriod7);
            period.add(timePeriod8);
            period.add(timePeriod9);
            period.add(timePeriod10);
            period.add(timePeriod11);
            period.add(timePeriod12);
            period.add(timePeriod13);
            period.add(timePeriod14);
            period.add(timePeriod15);
            period.add(timePeriod16);
            period.add(timePeriod18);
            period.add(timePeriod19);
            period.add(timePeriod20);
            period.add(timePeriod21);
            period.add(timePeriod22);
            period.add(timePeriod23);
            period.add(timePeriod24);
            period.add(timePeriod25);
            period.add(timePeriod26);
            period.add(timePeriod27);
            period.add(timePeriod28);
            period.add(timePeriod29);
            period.add(timePeriod30);
            period.add(timePeriod31);
            period.add(timePeriod32);
            period.add(timePeriod33);
            period.add(timePeriod34);
            period.add(timePeriod35);
            period.add(timePeriod36);
            period.add(timePeriod37);
            period.add(timePeriod38);
            period.add(timePeriod39);
            period.add(timePeriod40);
            period.add(timePeriod41);
            period.add(timePeriod42);
            period.add(timePeriod43);
            period.add(timePeriod44);
            period.add(timePeriod45);
            period.add(timePeriod46);
            period.add(timePeriod47);
            period.add(timePeriod48);
            period.add(timePeriod49);
            period.add(timePeriod50);
            period.add(timePeriod51);
            period.add(timePeriod52);
            period.add(timePeriod53);
            period.add(timePeriod54);
            period.add(timePeriod55);
            period.add(timePeriod56);
            period.add(timePeriod57);
            period.add(timePeriod58);
            period.add(timePeriod59);
            period.add(timePeriod60);
            period.add(timePeriod61);





            for(TimePeriod timePeriod: period){

                Classrooms classroom1 = new Classrooms("A1", 1, new String [] {"linux", "cross"}, null);
                Classrooms classroom2 = new Classrooms("A2", 1, new String [] {"linux", "cross"}, null);
                Classrooms classroom3 = new Classrooms("A3", 1, new String [] {"windows", "cross"}, null);
                Classrooms classroom4 = new Classrooms("A4", 1, new String [] {"windows", "cross"}, null);
                Classrooms classroom5 = new Classrooms("A5", 1, new String [] {"cross", "linux", "windows"}, null);
//                Classrooms classroom6 = new Classrooms("A6", 1, new String [] {"cross", "linux", "windows"}, null);

                List<Classrooms> classrooms = new ArrayList<>();

                classrooms.add(classroom1);
                classrooms.add(classroom2);
                classrooms.add(classroom3);
                classrooms.add(classroom4);
                classrooms.add(classroom5);
//                classrooms.add(classroom6);

                timePeriod.setClassrooms(classrooms);

            }

            Integer order = 0;
            String [] days = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

            for(String day: days){
                System.out.println("Day: " + day);
                dayRepository.save(new Day(day, order, period));
                order++;
            }


            Set<String> classroomsSet = new HashSet<>();
            List<Classrooms> classroomsList = classroomsRepository.findAll();

            for(Classrooms classrooms: classroomsList)
                classroomsSet.add(classrooms.getClassroom());

            for(String room: classroomsSet)
                classroomsSettingsRepository.save(new ClassroomsSettings(room, true));

            System.out.println("Data inserted!");
        }

        return new ResponseEntity<>(courseList, HttpStatus.OK);

    }

    @RequestMapping("/courseList")
    public List<Course> courseList() throws Exception{
        return courseRepository.findAll();
    }

    @RequestMapping("/classrooms")
    public List<Classrooms> getClassrooms() throws Exception{

        List<Classrooms> classroomsList = classroomsRepository.findAll();

        return classroomsList;

    }

    @PostMapping("/saveClassroomSettings")
    public ResponseEntity saveClassSettings(@RequestBody ClassroomsSettings classroomsSettings) throws Exception{

        ClassroomsSettings room =  classroomsSettingsRepository.save(classroomsSettings);

        return new ResponseEntity(room, HttpStatus.OK);

    }

    @GetMapping("/getClassroomSettings")
    public List<ClassroomsSettings> allClassroomSettings() throws Exception{
        return classroomsSettingsRepository.findAll();
    }

    @GetMapping("/departments")
    public List<Department> getDepartments() throws Exception{
        return departmentRepository.findAll();
    }

    @PostMapping("/addDepartment")
    public ResponseEntity addDepartment(@RequestBody Department department) throws Exception{

        Department exist = departmentRepository.findOneById(department.getId());

        if(exist != null)
            return new ResponseEntity(department, HttpStatus.NO_CONTENT);

        departmentRepository.save(department);

        return new ResponseEntity(department, HttpStatus.OK);
    }


    @PostMapping("/deleteDepartment")
    public ResponseEntity deleteDepartment(@RequestBody Department department) throws Exception{
        departmentRepository.delete(department);

        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/addClassroom")
    public ResponseEntity addClassroom(@RequestBody Classrooms classroom) throws Exception{

        List<Classrooms> classr = classroomsRepository.findAllByClassroom(classroom.getClassroom());

        if(!classr.isEmpty())
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);

        List<TimePeriod> timePeriodList = timePeriodRepository.findAll();

        for(TimePeriod timePeriod: timePeriodList){
            Classrooms room = new Classrooms(classroom.getClassroom(), 1, classroom.getAllowedTypes(), null);
            List<Classrooms> classroomsList = timePeriod.getClassrooms();
            classroomsList.add(room);
            timePeriod.setClassrooms(classroomsList);
            timePeriodRepository.save(timePeriod);
        }

        ClassroomsSettings classroomsSettings = new ClassroomsSettings(classroom.getClassroom(), false);
        classroomsSettingsRepository.save(classroomsSettings);

        return new ResponseEntity(null, HttpStatus.OK);

    }

    @GetMapping("/allUniqueClassrooms")
    public ResponseEntity getAllClassrooms()  throws Exception{

        List<Classrooms> classroomsList = classroomsRepository.findAll();

        List<Classrooms> uniqueClassrooms = new ArrayList<>();

        for(Classrooms classrooms: classroomsList){
            if(checkClassroom(uniqueClassrooms, classrooms.getClassroom()))
                uniqueClassrooms.add(classrooms);
        }

        return new ResponseEntity(uniqueClassrooms, HttpStatus.OK);
    }

    @PostMapping("/deleteClassroom")
    public ResponseEntity deleteClassroom(@RequestBody Classrooms classroom) throws Exception{

        List<Classrooms> classroomsList = classroomsRepository.findAllByClassroom(classroom.getClassroom());
        classroomsRepository.deleteAll(classroomsList);

        ClassroomsSettings classroomsSettings = classroomsSettingsRepository.getOne(classroom.getClassroom());
        classroomsSettingsRepository.delete(classroomsSettings);

        List<ClassroomsSettings> classroomsSettingsRepositoryList = classroomsSettingsRepository.findAll();
        for(ClassroomsSettings classrooms: classroomsSettingsRepositoryList){
            if(classrooms.getStatus() == false){
                classrooms.setStatus(true);
                classroomsSettingsRepository.save(classrooms);
                break;
            }
        }


        return new ResponseEntity(null, HttpStatus.OK);

    }

    @RequestMapping("/deleteAllData")
    public ResponseEntity deleteAlldata() throws Exception{

        dayRepository.deleteAll();
        timePeriodRepository.deleteAll();
        classroomsRepository.deleteAll();
        courseRepository.deleteAll();
        classroomsSettingsRepository.deleteAll();


        return new ResponseEntity(null, HttpStatus.OK);
    }

    @RequestMapping("/addCourse")
    public ResponseEntity addCourse(@RequestBody Course course) throws Exception{

        Department department = departmentRepository.findOneById(course.getDepartment().getId());

        System.out.println(course.toString());

        Course exist = courseRepository.findOneById(course.getId());

        if(exist != null)
            return new ResponseEntity(null, HttpStatus.NO_CONTENT);

        course.setDepartment(department);

        courseRepository.save(course);

        return new ResponseEntity(course, HttpStatus.OK);

    }

    @PostMapping("/deleteCourse")
    public ResponseEntity deleteCourse(@RequestBody Course course) throws Exception{

        courseRepository.delete(course);

        return new ResponseEntity(course, HttpStatus.OK);

    }



    public Boolean checkClassroom(List<Classrooms> classroomsList, String classroom) throws  Exception{

        Boolean status = true;

        for(Classrooms classrooms: classroomsList){
            if(classrooms.getClassroom().equalsIgnoreCase(classroom))
                status = false;
        }

        return status;

    }




}
