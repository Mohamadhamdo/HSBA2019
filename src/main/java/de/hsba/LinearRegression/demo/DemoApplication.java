package de.hsba.LinearRegression.demo;


public class DemoApplication {

	public static void main(String[] args) {
	    /**
	     * The constructor needs 3 pieces of information in order to execute
         * The code.
         * 1. Dataset need to be specified. Give the data set number which is between 1 and 3
         * 2. ShowComment: select true to show the comments of the developer. It will be recommended to select dataset number 1.
         * 3. Limit: when a variable does not show any improvement for a certain number of time on a row with in the limit, it will not be called again for further development
	    */
		Implementation dataset = new Implementation(3, false,3000);


        // temprature value needs to be more than one
       double [] tempratueValues= {2,5,10,20, 50};
        // cooling rate e.g. 0.001
        double [] coolingRate= {0.000001};
        // factorToMultiply must be greater than one
        double [] factorToMultiply= {5};
        for (int x=0;x<tempratueValues.length;x++){
            for (int y=0; y<coolingRate.length;y++){
                for (int z =0; z<factorToMultiply.length;z++){
                    dataset.optimizationOfAandB(tempratueValues[x],coolingRate[y],factorToMultiply[z]);
                }
            }
        }
        // excel values of set 2
        /*dataset.setbVariable(100.329);
        dataset.setA1(2);
        dataset.setA2(0.007);
        dataset.setA3(30.026);
        System.out.println("Excel calculation is: "+ dataset.estimatingTheReesult());*/

	}


}

