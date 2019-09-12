package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingRequestOutputModelMarketTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingRequestOutputModel
 */
public class BQMarketTrackingRequestOutputModel   {
  private BQMarketTrackingRequestOutputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord = null;

  private String marketTrackingRequestActionTaskReference = null;

  private Object marketTrackingRequestActionTaskRecord = null;

  private String marketTrackingRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get marketTrackingInstanceRecord
   * @return marketTrackingInstanceRecord
  **/

  public BQMarketTrackingRequestOutputModelMarketTrackingInstanceRecord getMarketTrackingInstanceRecord() {
    return marketTrackingInstanceRecord;
  }

  public void setMarketTrackingInstanceRecord(BQMarketTrackingRequestOutputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord) {
    this.marketTrackingInstanceRecord = marketTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Market Tracking instance request service call 
   * @return marketTrackingRequestActionTaskReference
  **/

  public String getMarketTrackingRequestActionTaskReference() {
    return marketTrackingRequestActionTaskReference;
  }

  public void setMarketTrackingRequestActionTaskReference(String marketTrackingRequestActionTaskReference) {
    this.marketTrackingRequestActionTaskReference = marketTrackingRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return marketTrackingRequestActionTaskRecord
  **/

  public Object getMarketTrackingRequestActionTaskRecord() {
    return marketTrackingRequestActionTaskRecord;
  }

  public void setMarketTrackingRequestActionTaskRecord(Object marketTrackingRequestActionTaskRecord) {
    this.marketTrackingRequestActionTaskRecord = marketTrackingRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Market Tracking service request record 
   * @return marketTrackingRequestRecordReference
  **/

  public String getMarketTrackingRequestRecordReference() {
    return marketTrackingRequestRecordReference;
  }

  public void setMarketTrackingRequestRecordReference(String marketTrackingRequestRecordReference) {
    this.marketTrackingRequestRecordReference = marketTrackingRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

