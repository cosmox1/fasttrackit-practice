package tema7_cursul10;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CitireXLXSFile {
    public static void main(String[] args) {
        String path= "E:\\JAVA\\testExcel.xls";
        try {

            Workbook workbook= WorkbookFactory.create(new File(path));
            Sheet firstSheet= workbook.getSheetAt(0);
            Iterator<Row> it= firstSheet.rowIterator();
            List<CustomerPurches> customerPurchesList= new ArrayList<>();
            while (it.hasNext()){
                CustomerPurches customerPurches= new CustomerPurches();
                Row currentRow= it.next();
                for (Cell currentCell: currentRow){
                    CellAddress address=currentCell.getAddress();
                    switch (address.getColumn()){
                        case'0':
                            customerPurches.setID((int) currentCell.getNumericCellValue());
                            break;
                        case '1':
                            customerPurches.setPurchasedProdct(currentCell.getStringCellValue());
                            break;
                        case '2':
                            customerPurches.setName(currentCell.getStringCellValue());
                            break;
                        case'8':
                            customerPurches.setCategory(currentCell.getStringCellValue());
                            break;

                    }
                }
                customerPurchesList.add(customerPurches);

            }
            System.out.println("lista este\n" + customerPurchesList );
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
//Fix ME!