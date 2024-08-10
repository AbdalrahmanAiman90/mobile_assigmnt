// Interface for Receipt any one should write this fun
interface Receipt {
    fun generateReceipt(): String
}

// Interface for Department any one should write this fun  and varible

interface Department {
    val departmentName: String//should do
    fun getDepartmentDetails(): String//should do
}

// person class for doctor and piatent
open class Person(val name: String, val age: Int) {
    fun getDetails(): String {
        return "Name: $name, Age: $age"
    }
}

// Doctor class inheriting from Person
class Doctor(name: String, age: Int, val namePatian:Patient,val specialization: String) : Person(name, age) {

    fun treatPatient(): String {
        return "Dr. $name is treating ${namePatian.name} and the patint ailment from ${namePatian.ailment} for $specialization. department"
    }
}

// Patient class inheriting from Person
class Patient(name: String, age: Int, val ailment: String) : Person(name, age) {
    fun getAilmentDetails(): String {
        return "Patient $name and is age ${age} is suffering from $ailment. "
    }
}

// Class for Hospital Departments implementing Department interface
class HospitalDepartment(override val departmentName: String) : Department {
    override fun getDepartmentDetails(): String {
        return " $departmentName"
    }
}

// Class for Medical Receipt implementing Receipt interface
class MedicalReceipt( val patient: Patient,val department:HospitalDepartment,  val doctor: Doctor,  val treatmentCost: Double) : Receipt {
    override fun generateReceipt(): String {
        return """
            Receipt:
            Patient: ${patient.name}
            Treated by: Dr. ${doctor.name}
            Treatment Cost: $$treatmentCost
            department_detial:${department.getDepartmentDetails()}
        """
    }
}

// Example usage
fun main() {

    val patient = Patient(name = "Ali", age = 45, ailment = "alzahimer")
 println(   patient.getAilmentDetails())//data of paint
    val doctor = Doctor(name = "Mohmed", age = 38,patient ,specialization = "General Medicine")
  println( doctor.treatPatient())//data of doctor and piant that treat it
    val department = HospitalDepartment(departmentName = "General Medicine")
  println(  department.getDepartmentDetails())//data of department
    val receipt = MedicalReceipt(patient,department ,doctor, treatmentCost = 150.0,)
    println("==============================================")
    println(receipt.generateReceipt())
    println("==============================================")


}
