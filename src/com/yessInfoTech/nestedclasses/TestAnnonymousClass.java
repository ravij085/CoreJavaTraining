package com.yessInfoTech.nestedclasses;

class Student {
	void study() {
		System.out.println("studying from concrete class");
	}
}

abstract class Engineer {
	abstract void design();
}

interface Doctor {
	void diagnose();
}

public class TestAnnonymousClass {

	public static void main(String[] args) {

		Student stud1 = new Student();
		Student stud = new Student() {

			void study() {
				System.out.println("studying from annonymous class");
			}

		};

		stud.study();
		stud1.study();

		Engineer engineer = new Engineer() {

			@Override
			void design() {
				System.out.println("designing from annonymous class");

			}
		};

		engineer.design();

		Doctor doctor = new Doctor() {

			@Override
			public void diagnose() {
				System.out.println("diagnosing a patient from annonymous class");

			}
		};

		doctor.diagnose();

	}

}
