package SalesReport.ui;
import java.text.NumberFormat;

/*
* ITC 115 W16 - 3182
* Assignment 7
* 
* Blake Schwartz
* February 28, 2016
*/

public class SalesReportApp {

    public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
    	double totalSales = 0;		
    	
    	System.out.println("Display sales report");
		System.out.println("Console");
		System.out.println("Welcome to the Sales Report");	
		System.out.println();		
    	
		//sales by region and quarter
		double [][] sales = {{1540.0, 2010.0, 2450.0, 1845.0},//region 1
				{1130.0, 1168.0, 1847.0, 1491.0},//region 2
				{1580.0, 2305.0, 2710.0, 1284.0},//region 3
				{1105.0, 4102.0, 2391.0, 1576.0}};//region 4
		
		System.out.println("Region\t" + "Q1\t\t" + "Q2\t\t" + "Q3\t\t" + "Q4");
		int r = 0;
			for(double[] row : sales){
				r++;
				System.out.print(r + "\t");
				for (double column : row){
					totalSales += column;					
					System.out.print(NumberFormat.getCurrencyInstance().format(column) + "\t");
				}
				System.out.print("\n");
			}
			System.out.println();
			
		//sales by region
		System.out.println("Sales by region:");			
		for (int region = 0; region < 4; region++){
			double regionTotal = 0;			
			for (int quarter = 0; quarter < 4; quarter++){
				regionTotal += sales[region][quarter];
			}
			int regionNumber = region + 1;
			System.out.println("Region " + regionNumber + ": " + NumberFormat.getCurrencyInstance().format(regionTotal));
		}
		System.out.println();		
		
		//sales by quarter
		System.out.println("Sales by quarter:");		
		for (int region = 0; region < 4; region++){
			double quarterTotal = 0;			
			for (int quarter = 0; quarter < 4; quarter++){
				quarterTotal += sales[quarter][region];
			}
			int quarter = 0;
			int quarterNumber = quarter + 1;
			System.out.println("Q" + quarterNumber + ": " + NumberFormat.getCurrencyInstance().format(quarterTotal));
		}
		System.out.println();		

		System.out.println("Total annual sales, all regions: " + NumberFormat.getCurrencyInstance().format(totalSales));		
			
		}
	}

