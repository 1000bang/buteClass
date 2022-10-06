package io_ex.ch06;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;


// object 파일에 저장하고 싶을 때 
//  FileOutStream + FileObjectOutStream 을 열어놔야함
// writeObject(Object);
// 직렬화 시켜야함 클래스를 바이트 단위로 직렬화(0101로 클래스를 압축한다) 시킨다.

//Serializable - 직렬화
public class Student implements Serializable {

	//serialVersionUID 고유값을 지정 (권장사항) 없으면 경고로 알아서 만들어줄 수 있음
	private static final long serialVersionUID = 1L;
	String name;
	String tel;
	transient int age;  //직렬화 시킬 때 제외 (데이터가 파일에 저장 안됨)

	// 기본 생성자를 넣어줘야 한다.

	// 컴파일러가 기본 생성자 알아서 넣어줌 ㅎㅎ
	// 근데 사용자 정의 생성자가 하나라도 있으면 기본 생성자 안 넣어줌
	public Student(String name, String tel, int age) {
		super();
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", tel=" + tel + ", age=" + age + "]";
	}

}
