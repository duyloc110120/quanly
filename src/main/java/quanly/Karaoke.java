/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly;

/**
 *
 * @author duyloc
 */
public class Karaoke extends DichVu{
	private int thoiGianThue;

	public Karaoke(int ma, String ten, double gia, int thoiGianThue) {
		super(ma, ten, gia);
		this.thoiGianThue = thoiGianThue;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.printf("Thời gian thuê (giờ): %d\n", this.thoiGianThue);
	}
	
//getter and setter	
	public int getThoiGianThue() {
		return thoiGianThue;
	}

	public void setThoiGianThue(int thoiGianThue) {
		this.thoiGianThue = thoiGianThue;
	}		
}