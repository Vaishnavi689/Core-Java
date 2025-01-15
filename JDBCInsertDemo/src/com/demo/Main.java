package com.demo;

public class Main {

	public static void main(String[] args) throws Exception {
		InsertData insert=new InsertData();
		 SelectData select=new SelectData();
		 UpdateData update=new UpdateData();
		 DeleteData delete =new DeleteData();
		 insert.InsertData();
		 select.selectData();
		 update.UpdateData();
		 delete.DeleteData();
		 System.out.println("save data:");
		 
		 
	}

	

}
