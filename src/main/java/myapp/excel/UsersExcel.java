package myapp.excel;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;


public class UsersExcel {
    FileInputStream fileInput;
    //Create Workbook instance holding reference to .xlsx file
    XSSFWorkbook workbook;

    public UsersExcel(FileInputStream fileInput) {
        setFileInput(fileInput);
        setWorkbook(this.fileInput);

    }

    public void setWorkbook(FileInputStream fileInput) {
        try {
            this.workbook = new XSSFWorkbook(fileInput);
        }catch (IOException exc){
            exc.printStackTrace();
        }
    }

    public void setFileInput(FileInputStream fileInput) {
        this.fileInput = fileInput;
    }

    public FileInputStream getFileInput() {
        return fileInput;
    }

    public XSSFWorkbook getWorkbook() {
        return this.workbook;
    }

    public void readTable(){

    }
}
