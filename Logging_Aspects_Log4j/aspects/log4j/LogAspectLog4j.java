package logging;

import org.apache.log4j.Logger;
import banking.InsufficientBalanceException;
import banking.AccountException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public aspect LogAspectLog4j
{
	static Logger logger = Logger.getLogger(LogAspectLog4j.class);
	declare precedence:LogAspectLog4j,*;
	private pointcut logjExec(): execution (* *.*(..));
	before(): logjExec(){
		
		logger.info("=>Entering "+ thisJoinPoint.getSignature().getDeclaringType().getSimpleName()+" "+ thisJoinPoint.getSignature().getName().toString()+" ");	
	}
 
after() throwing(AccountException e):call (* *.*(..)throws AccountException)
{
	logger.error("=>exception "+e.fillInStackTrace());
}

}