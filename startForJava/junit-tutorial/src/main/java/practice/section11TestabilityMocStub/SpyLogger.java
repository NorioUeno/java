package practice.section11TestabilityMocStub;

import java.util.logging.Logger;

public class SpyLogger extends Logger {
  final Logger base;
  final StringBuffer  log = new StringBuffer();


  public SpyLogger(Logger base) {
    super(base.getName(),base.getResourceBundleName());
    this.base = base;
  }

//  infoのみ対応
  @Override
  public void info(String msg) {
    log.append(msg);
    base.info(msg);

  }


}
