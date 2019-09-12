package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingExecuteOutputModelMarketTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingExecuteOutputModel
 */
public class BQMarketTrackingExecuteOutputModel   {
  private BQMarketTrackingExecuteOutputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord = null;

  private String marketTrackingExecuteActionTaskReference = null;

  private Object marketTrackingExecuteActionTaskRecord = null;

  private String marketTrackingExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get marketTrackingInstanceRecord
   * @return marketTrackingInstanceRecord
  **/

  public BQMarketTrackingExecuteOutputModelMarketTrackingInstanceRecord getMarketTrackingInstanceRecord() {
    return marketTrackingInstanceRecord;
  }

  public void setMarketTrackingInstanceRecord(BQMarketTrackingExecuteOutputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord) {
    this.marketTrackingInstanceRecord = marketTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Market Tracking instance execute service call 
   * @return marketTrackingExecuteActionTaskReference
  **/

  public String getMarketTrackingExecuteActionTaskReference() {
    return marketTrackingExecuteActionTaskReference;
  }

  public void setMarketTrackingExecuteActionTaskReference(String marketTrackingExecuteActionTaskReference) {
    this.marketTrackingExecuteActionTaskReference = marketTrackingExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return marketTrackingExecuteActionTaskRecord
  **/

  public Object getMarketTrackingExecuteActionTaskRecord() {
    return marketTrackingExecuteActionTaskRecord;
  }

  public void setMarketTrackingExecuteActionTaskRecord(Object marketTrackingExecuteActionTaskRecord) {
    this.marketTrackingExecuteActionTaskRecord = marketTrackingExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Market Tracking execute transaction/record 
   * @return marketTrackingExecuteRecordReference
  **/

  public String getMarketTrackingExecuteRecordReference() {
    return marketTrackingExecuteRecordReference;
  }

  public void setMarketTrackingExecuteRecordReference(String marketTrackingExecuteRecordReference) {
    this.marketTrackingExecuteRecordReference = marketTrackingExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

