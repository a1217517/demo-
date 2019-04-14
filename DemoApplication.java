package com.example.demo;

import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@SpringBootApplication
public class DemoApplication {

	public static String  getMonth(String str,Function<String ,String> func){

		return func.apply(str);

	}
	public static List<Integer> getList(int num, Supplier<Integer> sup){
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < num ; i++) {
			arrayList.add(sup.get());
		}
		return arrayList;
	}

	public static void setNum(Integer i , Consumer<Integer> con){
		con.accept(i+20);

	}
	public static ArrayList<Integer> filter(List<Integer> list, Predicate<Integer> pre){
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(Integer integer :list){
				if (pre.test(integer)){
					arrayList.add(integer);
				}

			}
			return arrayList;
	}

	public static void main(String[] args) {
		/*System.out.println("thread======"+Thread.currentThread());

		for (int i = 0; i <10 ; i++) {
			new Thread(()-> System.out.println("thread======"+Thread.currentThread())).start();
		}*/

	/*	List<Integer>  list =Arrays.asList(2,2,4,1);
		//list.stream()
		list.forEach((Integer n )-> System.out.println(n));*/
		//list.forEach(System.out::println);
	//	SpringApplication.run(DemoApplication.class, args);

	//	System.out.println(LocalDate.now());
	/*	String month = getMonth("20181231",(x)->x.substring(0,6));
		System.out.println(month);
		getList(10,()->((int)Math.random()*100));
		HashMap<Object, Object> map = new HashMap<>();
		setNum(12,(x)->map.put("data",x));
*/
		List<Integer> list = Arrays.asList(3, 4, 2);
		ArrayList<Integer> filter = filter(list, (x) -> x > 2);
		filter.forEach((x)-> System.out.println(x));

	}
}
