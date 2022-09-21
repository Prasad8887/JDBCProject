package com.dao;
import java.sql.SQLException;
import java.util.List;

import com.entity.DoctorClass;
import com.entity.PatientClass;
public interface Hospitaldao
{
	public List<PatientClass> viewPatient() throws ClassNotFoundException, SQLException;
	public void insertNewPatient(PatientClass p) throws ClassNotFoundException, SQLException;
	public void updatePatient(PatientClass p) throws ClassNotFoundException, SQLException;
    public void deletePatient(PatientClass p) throws ClassNotFoundException, SQLException;
    
    public List<DoctorClass> viewDoctor() throws ClassNotFoundException, SQLException;
	public void insertNewDoctor(DoctorClass d) throws ClassNotFoundException, SQLException;
	public void updateDoctor(DoctorClass d) throws ClassNotFoundException, SQLException;
    public void deleteDoctor(DoctorClass d) throws ClassNotFoundException, SQLException;
}
