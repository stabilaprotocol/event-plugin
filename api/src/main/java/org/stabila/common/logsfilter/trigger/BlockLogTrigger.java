package org.stabila.common.logsfilter.trigger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

public class BlockLogTrigger extends Trigger {
  @Getter
  @Setter
  private long blockNumber;

  @Getter
  @Setter
  private String blockHash;

  @Getter
  @Setter
  private long transactionSize;

  @Getter
  @Setter
  private List<String> transactionList = new ArrayList<>();


  /**
   * address of executive
   */
  @Getter
  @Setter
  private String executiveAddress;

  @Getter
  @Setter
  private long executivePayPerBlock;

  @Getter
  @Setter
  Map<String, Long> executiveMap = new HashMap<>();

  public BlockLogTrigger() {
    setTriggerName(BLOCK_TRIGGER_NAME);
  }

  @Override
  public String toString() {
    return new StringBuilder().append("triggerName: ").append(getTriggerName())
      .append("timestamp: ")
      .append(timeStamp)
      .append(", blockNumber: ")
      .append(blockNumber)
      .append(", blockhash: ")
      .append(blockHash)
      .append(", transactionSize: ")
      .append(transactionSize)
      .append(", transactionList: ")
      .append(transactionList)
      .append(", executiveAddress: ")
      .append(executiveAddress)
      .append(", executivePayPerBlock: ")
      .append(executivePayPerBlock)
      .append(", executiveMap: ")
      .append(executiveMap)
      .toString();
  }
}
