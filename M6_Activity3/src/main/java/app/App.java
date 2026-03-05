package app;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import model.Course;
import model.Profile;
import model.Student;
import util.EntityManagerUtil;

	public class App 
	{
		   public static void main(String[] args) {
				EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

				try {
//							persistStudents(em);
//							persistOneToOne(em);
							persistOneToMany(em);
							
						} finally {
							EntityManagerUtil.getInstance().closeEntityManager(em);
							EntityManagerUtil.getInstance().shutdownFactory();
						}
					}

			static void persistStudents(EntityManager em) {
						
					em.getTransaction().begin();

					Student newStudent = new Student();
					newStudent.setName("Juan Dela Cruz");
					newStudent.setAge(21);
					newStudent.setEmail("juandelacruz@gmail.com");
					em.persist(newStudent);
					
					em.getTransaction().commit();
						
			}
			
			static void persistOneToOne(EntityManager em) {
					
					em.getTransaction().begin();
					
					Student newStudent1 = new Student();
					newStudent1.setName("Juan Dela Cruz");
					newStudent1.setAge(21);
					newStudent1.setEmail("juandelacruz@example.com");
					em.persist(newStudent1);
					
					Profile newStudentProfile = new Profile();
					newStudentProfile.setAddress("Pasig City");
					newStudentProfile.setNationality("Filipino");
					newStudentProfile.setStudent(newStudent1);
					em.persist(newStudentProfile);
					
					newStudent1.setProfile(newStudentProfile);
					
					em.getTransaction().commit();
			}
			
			static void persistOneToMany(EntityManager em) {
				em.getTransaction().begin();
				
				Student student1 = em.find(Student.class, 1L);
				
				Course newCourse = new Course();
				newCourse.setCourseName("Math");
				newCourse.setGrade("80");
				newCourse.setStudent(student1);
				
				em.persist(newCourse);
				
				em.getTransaction().commit();
		}
	}
