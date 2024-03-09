package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong {
	Set<String>setPhieu = new HashSet<String>();
	
	
	public RutThamTrungThuong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RutThamTrungThuong(Set<String> setPhieu) {
		this.setPhieu = setPhieu;
	}

	public boolean addPhieu(String giaTri) {
		return this.setPhieu.add(giaTri);
	}

	public boolean removePhieu(String giaTri) {
		return this.setPhieu.remove(giaTri);
	}
	
	public boolean checkPhieuIsExist(String giaTri) {
		return this.setPhieu.contains(giaTri);
	}
	
	public void removeAllPhieu() {
		this.setPhieu.clear();
	}
	
	public int getSoLuong() {
		return this.setPhieu.size();
	}
	
	public String rutTham() {
		String result = "";
		Random rd = new Random();
		int index = rd.nextInt(this.setPhieu.size() - 1);
		result = (String) this.setPhieu.toArray()[index];
		return result;
			
	}
	
	public void printAll() {
		System.out.println(Arrays.toString(this.setPhieu.toArray()));
	}
	
	public static void main(String agrs[]) {
	/*HASH SET: rút thăm trúng thưởng*/
	int opt = 0;
	Scanner sc = new Scanner(System.in);
	RutThamTrungThuong rt = new RutThamTrungThuong();
	do {
		System.out.println("-------------------------");
		System.out.println("-----------MENU----------");
		System.out.println("1.Them ma du thuong. \n");
		System.out.println("2.Xoa ma du thuong. \n");
		System.out.println("3.Kiem tra ma du thuong co ton tai. \n");
		System.out.println("4.Xoa tat ca phieu du thuong. \n");
		System.out.println("5.So luong ma du thuong. \n");
		System.out.println("6.Rut tham trung thuong. \n");
		System.out.println("7.In tat ca phieu \n");
		System.out.println("Thoat khoi chuong trinh. \n");
		
		opt = sc.nextInt();
		sc.nextLine();
		switch (opt) {
		case 1:
			System.out.println("Nhap vao ma phieu du thuong: ");
			String giaTri = sc.nextLine();
			rt.addPhieu(giaTri);
			break;
		case 2:
			System.out.println("Nhap vao ma phieu du thuong: ");
			String giaTri1 = sc.nextLine();
			rt.removePhieu(giaTri1);
			break;
		case 3:
			System.out.println("Nhap vao ma phieu du thuong: ");
			String giaTri2 = sc.nextLine();
			System.out.println("Kiem tra ma du thuong co ton tai: " + rt.checkPhieuIsExist(giaTri2));
			break;
		case 4:
			rt.removeAllPhieu();
			break;
		case 5: 
			System.out.println("So luong ma du thuong: " + rt.getSoLuong());
			break;
		case 6: 
			System.out.println("Rut tham trung thuong: " + rt.rutTham());
			break;
		case 7:
			System.out.println("7.Tat ca phieu \n");
			rt.printAll();
			break;
		default:
			System.out.println("Error!");
			break;
		}
	}while(opt != 0);
	
	}
	
	
}
