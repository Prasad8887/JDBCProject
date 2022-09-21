package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.DoctorClass;
import com.entity.PatientClass;


public class HospitalImplementation implements Hospitaldao
{

	@Override
	public List<PatientClass> viewPatient() throws ClassNotFoundException, SQLException {
		ArrayList<PatientClass>patientList=new ArrayList<PatientClass>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		
		
		PreparedStatement statement =con.prepareStatement("select * from HospitalPatient");
		ResultSet rs=statement.executeQuery();
		
		while(rs.next())
		{
			PatientClass p=new PatientClass();
			System.out.println("=============================Patient Data================");
			System.out.print((rs.getInt(1)));
			System.out.print("\t"+(rs.getString(2)));
			System.out.print("\t"+(rs.getString(3)));
			System.out.print("\t"+(rs.getString(4)));
			System.out.print("\t"+(rs.getLong(5)));
			System.out.print("\t"+(rs.getString(6)));
			System.out.print("\t"+(rs.getString(7)));
			System.out.print("\t"+(rs.getString(8)));
			System.out.print("\t"+(rs.getString(9)));
			System.out.print("\t"+(rs.getString(10)));
			System.out.println();
		
	}
		return patientList;
	}

	@Override
	public void insertNewPatient(PatientClass p) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		PreparedStatement statement =con.prepareStatement("insert into Patient values(?,?,?,?,?,?,?,?,?,?)");
		statement.setInt(1, p.getPid());
		statement.setString(2, p.getName());
		statement.setString(3, p.getBirthdate());
		statement.setString(4,p.getGender());
		statement.setLong(5,p.getMobileNo());
		statement.setString(6,p.getAddress());
		statement.setString(7,p.getBloodGroup());
		statement.setString(8,p.getDiseases());
		statement.setString(9,p.getMedicineAllergy());
		statement.setString(10,p.getDoctorId());
		row=statement.executeUpdate();
		
	}


	@Override
	public void updatePatient(PatientClass p) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		PreparedStatement statement =con.prepareStatement("update Patient set Name=?,birthdate=?,gender=?,mobileNo=?,address=?,bloodGroup=?,diseases=?,medicineAllergy=?,doctorId=? where pid=?");
		statement.setInt(1, p.getPid());
		statement.setString(2, p.getName());
		statement.setString(3, p.getBirthdate());
		statement.setString(4, p.getGender());
		statement.setLong(5, p.getMobileNo());
		statement.setString(6, p.getAddress());
		statement.setString(7, p.getBloodGroup());
		statement.setString(8, p.getDiseases());
		statement.setString(9, p.getMedicineAllergy());
		statement.setString(10, p.getDoctorId());
		row=statement.executeUpdate();
		con.close();
	}

	@Override
	public void deletePatient(PatientClass p) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		PreparedStatement statement =con.prepareStatement("delete from Patient where pid=?");
		statement.setInt(1, p.getPid());
		row=statement.executeUpdate();
		
	}
	/*--------------------------------------------------------------------------------------*/
	
	@Override
	public List<DoctorClass> viewDoctor() throws ClassNotFoundException, SQLException {
		ArrayList<DoctorClass>DoctorList=new ArrayList<DoctorClass>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		
		
		PreparedStatement statement =con.prepareStatement("select * from Doctor");
		ResultSet rs=statement.executeQuery();
		
		while(rs.next())
		{
			DoctorClass d=new DoctorClass();
			System.out.print((rs.getString(1)));
			System.out.print("\t"+(rs.getString(2)));
			System.out.print("\t"+(rs.getString(3)));
			System.out.print("\t"+(rs.getString(4)));
			System.out.print("\t"+(rs.getLong(5)));
			System.out.print("\t"+(rs.getString(6)));
			System.out.print("\t"+(rs.getString(7)));
			System.out.print("\t"+(rs.getString(8)));
			System.out.print("\t"+(rs.getString(9)));
			System.out.println();
			DoctorList.add(d);
			
		
	}
		return DoctorList;
	}

	@Override
	public void insertNewDoctor(DoctorClass d) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		PreparedStatement statement =con.prepareStatement("insert into Doctor values(?,?,?,?,?,?,?,?,?)");
		
		statement.setString(1, d.getDoctorId());
		statement.setString(2,d.getDname());
		statement.setString(3,d.getDbirthdate());
		statement.setString(4,d.getDgender());
		statement.setLong(5,d.getDmobileNo());
		statement.setString(6,d.getDaddress());
		statement.setString(7,d.getDbloodGroup());
		statement.setString(8,d.getSpeciality());
		statement.setString(9,d.getMedicineAllergy());
		row=statement.executeUpdate();
		
		
	}

	@Override
	public void updateDoctor(DoctorClass d) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		PreparedStatement statement =con.prepareStatement("update Doctor set dname=?,dbirthdate=?,dgender=?,dmobileNo=?,daddress=?,dbloodGroup=?,speciality=?,medicineAllergy=? where doctorId=?");
		
		statement.setString(1, d.getDoctorId());
		statement.setString(2,d.getDname());
		statement.setString(3,d.getDbirthdate());
		statement.setString(4,d.getDgender());
		statement.setLong(5,d.getDmobileNo());
		statement.setString(6,d.getDaddress());
		statement.setString(7,d.getDbloodGroup());
		statement.setString(8,d.getSpeciality());
		statement.setString(9,d.getMedicineAllergy());
		row=statement.executeUpdate();
		
	}

	@Override
	public void deleteDoctor(DoctorClass d) throws ClassNotFoundException, SQLException {
		int row;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		PreparedStatement statement =con.prepareStatement("delete from Doctor where doctorId=?");
		statement.setString(1, d.getDoctorId());
		row=statement.executeUpdate();
		
		
	}

	

}
