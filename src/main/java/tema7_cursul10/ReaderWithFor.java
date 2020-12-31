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

public class ReaderWithFor {
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
                   if (0==address.getColumn()){
                       customerPurches.setID((int) currentCell.getNumericCellValue());
                    }
                   else  if (1==address.getColumn()){
                       customerPurches.setPurchasedProdct(currentCell.getStringCellValue());
                   }
                   else if(2==address.getColumn()){
                       customerPurches.setName(currentCell.getStringCellValue());
                   }
                   else if (8==address.getColumn()){
                       customerPurches.setCategory(currentCell.getStringCellValue());
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

