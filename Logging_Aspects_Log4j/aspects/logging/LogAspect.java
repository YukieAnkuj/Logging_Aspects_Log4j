package logging;

import banking.InsufficientBalanceException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import banking.AccountException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Calendar;
public aspect LogAspect
{
	static Logger logger = Logger.getLogger("trace");
//	static Logger logger = Logger.getLogger(LogAspect.class);
//	declare precedence:LogAspect,*;
//	private pointcut logjExec(): execution (* *.*(..));
//	before(): logjExec(){
//		
//		logger.info("=>Entering "+ thisJoinPoint.getSignature().getDeclaringType().getSimpleName()+" "+ thisJoinPoint.getSignature().getName().toString()+" ");	
//	}
// 
//after() throwing(AccountException e):call (* *.*(..)throws AccountException)
//{
//	logger.error("=>exception "+e.fillInStackTrace());
//}

//	private pointcut loggerMethodExec() : execution (* *.*(..));
//	
//    before(): loggerMethodExec() {
//    	 Calendar cal = Calendar.getInstance();
//         DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM);
//            String loggerString=(df.format(cal.getTime())+ " "+thisJoinPoint.getSignature().getDeclaringType().getSimpleName()+" "+thisJoinPoint.getSignature().getName().toString()+"method");
//            System.out.println(loggerString);
//            System.out.println("\n"+"INFO: Entering");
//            //logger.info(loggerString);
//    }
//    
//    private pointcut exceptionExecution(InsufficientBalanceException e) : handler (InsufficientBalanceException)&&args(e);
//	//Logger logger=Logger.getLogger("trace");
//    before (InsufficientBalanceException e): exceptionExecution(e) {
//        System.out.println("This is an exception caught by the aspect:\n");
//       e.printStackTrace();
//    }
//    after() throwing(AccountException e):call (* *.*(..)throws AccountException)
//    {
//    	System.out.println("This is an exception caught by the aspect:\n"+e);
//    	//e.printStackTrace();
//    }
//    private pointcut loggerMethodExecWithParameters() : execution (* *.*(..));
//    before(): loggerMethodExecWithParameters() {
//   	 Calendar cal = Calendar.getInstance();
//        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM);
//        MethodSignature signature=(MethodSignature)thisJoinPoint.getSignature();
//        String[] parameterNames=signature.getParameterNames();
//        Object[] parameterValues=thisJoinPoint.getArgs();
//           String loggerString=(df.format(cal.getTime())+ " "+thisJoinPointStaticPart.getSignature().getDeclaringType().getSimpleName()+" "+thisJoinPointStaticPart.getSignature().getName().toString()+"method");
//           System.out.println(loggerString);
//           System.out.println("\n"+"INFO: Entering with values: ");
//           if(parameterNames.length!=0)
//           {
//        	   for(int i=0;i<parameterNames.length;i++ )
//               {
//            	   //if(parameterValues[i].getClass().isPrimitive())
//            	   System.out.println(parameterNames[i]+"="+parameterValues[i].toString()+",");
//               }
//           }
//           
           //logger.info(loggerString);
//   }
}