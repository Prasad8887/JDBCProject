package com.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.HospitalImplementation;
import com.entity.DoctorClass;
import com.entity.PatientClass;

public class Service 
{
	/*----------------------------Doctor------------------------------------------------------*/
	public void viewdoctor() throws ClassNotFoundException, SQLException
	{
		List<DoctorClass>doctorList=new HospitalImplementation().viewDoctor();
		for(DoctorClass d:doctorList)
		{
			
			
			
		}
		
	}
	
	public void insertDoctor() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Doctor Id");
		String doctorId=sc.next();
		System.out.println("enter the Doctor name");
		String dname=sc.next();
		System.out.println("enter the Doctor Birthdate");
		String dbirthdate=sc.next();
		System.out.println("enter the Doctor Gender");
		String dgender=sc.next();
		System.out.println("enter the Doctor MobileNO");
		long dmobileNo=sc.nextLong();
		System.out.println("enter the Doctor Address");
		String daddress=sc.next();
		System.out.println("enter the Doctor Blood Group");
		String dbloodGroup=sc.next();
		System.out.println("enter the Doctor Specility");
		String speciality=sc.next();
		System.out.println("enter the Doctor Medicine Allergy");
		String medicineAllergy=sc.next();
		
		
		
		DoctorClass d=new DoctorClass();
		d.setDoctorId(doctorId);
		d.setDname(dname);
		d.setDbirthdate(dbirthdate);
		d.setDgender(dgender);
		d.setDmobileNo(dmobileNo);
		d.setDaddress(daddress);
		d.setDbloodGroup(dbloodGroup);
		d.setSpeciality(speciality);
		d.setMedicineAllergy(medicineAllergy);
		
		new HospitalImplementation().insertNewDoctor(d);
		sc.close();
	}
	
	public void updateDoctor() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Doctor Id");
		String doctorId=sc.next();
		System.out.println("enter the Doctor name");
		String dname=sc.next();
		System.out.println("enter the Doctor Birthdate");
		String dbirthdate=sc.next();
		System.out.println("enter the Doctor Gender");
		String dgender=sc.next();
		System.out.println("enter the Doctor MobileNO");
		long dmobileNo=sc.nextLong();
		System.out.println("enter the Doctor Address");
		String daddress=sc.next();
		System.out.println("enter the Doctor Blood Group");
		String dbloodGroup=sc.next();
		System.out.println("enter the Doctor Specility");
		String speciality=sc.next();
		System.out.println("enter the Doctor Medicine Allergy");
		String medicineAllergy=sc.next();
		
		
		
		DoctorClass d=new DoctorClass();
		d.setDoctorId(doctorId);
		d.setDname(dname);
		d.setDbirthdate(dbirthdate);
		d.setDgender(dgender);
		d.setDmobileNo(dmobileNo);
		d.setDaddress(daddress);
		d.setDbloodGroup(dbloodGroup);
		d.setSpeciality(speciality);
		d.setMedicineAllergy(medicineAllergy);
		
		new HospitalImplementation().updateDoctor(d);
		sc.close();
	}
	
	public void deleteDoctor() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the Doctor id");
		String doctorId=sc.next();
		DoctorClass d=new DoctorClass();
		
		
		d.setDoctorId(doctorId);
		new HospitalImplementation().deleteDoctor(d);
		sc.close();
	}
	
	
	/*--------------------------------Patient------------------------------------*/
	public void view() throws ClassNotFoundException, SQLException
	{
		List<PatientClass>patientList=new HospitalImplementation().viewPatient();
		for(PatientClass p:patientList)
		{
			System.out.println("=============================Patient Data================");
			System.out.print("\t"+p.getPid());
			System.out.print("\t"+p.getName());
			System.out.print("\t"+p.getBirthdate());
			System.out.println("\t"+p.getGender());
			System.out.println("\t"+p.getMobileNo());
			System.out.println("\t"+p.getAddress());
			System.out.println("\t"+p.getBloodGroup());
			System.out.println("\t"+p.getDiseases());
			System.out.println("\t"+p.getMedicineAllergy());
			System.out.println("\t"+p.getDoctorId());
			
		}
	}
	
	public void insertPatient() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Patient Id");
		int pid=sc.nextInt();
		System.out.println("enter the Patient name");
		String name=sc.next();
		System.out.println("enter the Patient Birthdate");
		String birthdate=sc.next();
		System.out.println("enter the Patient Gender");
		String gender=sc.next();
		System.out.println("enter the Patient MobileNO");
		long mobileNo=sc.nextLong();
		System.out.println("enter the Patient Address");
		String address=sc.next();
		System.out.println("enter the Patient Blood Group");
		String bloodGroup=sc.next();
		System.out.println("enter the Patient Diseases");
		String diseases=sc.next();
		System.out.println("enter the Patient Medicine Allergy");
		String medicineAllergy=sc.next();
		System.out.println("enter the Doctor Id Whose handled the Patient");
		String doctorId=sc.next();
		
		PatientClass p=new PatientClass();
		p.setPid(pid);
		p.setName(name);
		p.setBirthdate(birthdate);
		p.setGender(gender);
		p.setMobileNo(mobileNo);
		p.setAddress(address);
		p.setBloodGroup(bloodGroup);
		p.setDiseases(diseases);
		p.setMedicineAllergy(medicineAllergy);
		p.setDoctorId(doctorId);
		new HospitalImplementation().insertNewPatient(p);
		sc.close();
	}
	
	public void updatePatient() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Patient Id");
		int pid=sc.nextInt();
		System.out.println("enter the Patient name");
		String name=sc.next();
		System.out.println("enter the Patient Birthdate");
		String birthdate=sc.next();
		System.out.println("enter the Patient Gender");
		String gender=sc.next();
		System.out.println("enter the Patient MobileNO");
		long mobileNo=sc.nextLong();
		System.out.println("enter the Patient Address");
		String address=sc.next();
		System.out.println("enter the Patient Blood Group");
		String bloodGroup=sc.next();
		System.out.println("enter the Patient Diseases");
		String diseases=sc.next();
		System.out.println("enter the Patient Medicine Allergy");
		String medicineAllergy=sc.next();
		System.out.println("enter the Doctor Id Whose handled the Patient");
		String doctorId=sc.next();
		
		PatientClass p=new PatientClass();
		p.setPid(pid);
		p.setName(name);
		p.setBirthdate(birthdate);
		p.setGender(gender);
		p.setMobileNo(mobileNo);
		p.setAddress(address);
		p.setBloodGroup(bloodGroup);
		p.setDiseases(diseases);
		p.setMedicineAllergy(medicineAllergy);
		p.setDoctorId(doctorId);
		new HospitalImplementation().updatePatient(p);
		
	}
	public void deletePatient() throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the Patient id");
		int pid=sc.nextInt();
		PatientClass p=new PatientClass();
		
		
		p.setPid(pid);
		new HospitalImplementation().deletePatient(p);
		sc.close();
	}
	
}
