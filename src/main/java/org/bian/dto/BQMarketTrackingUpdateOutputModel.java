package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingUpdateOutputModel
 */
public class BQMarketTrackingUpdateOutputModel   {
  private BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord = null;

  private String marketTrackingUpdateActionTaskReference = null;

  private Object marketTrackingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get marketTrackingInstanceRecord
   * @return marketTrackingInstanceRecord
  **/

  public BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord getMarketTrackingInstanceRecord() {
    return marketTrackingInstanceRecord;
  }

  public void setMarketTrackingInstanceRecord(BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord) {
    this.marketTrackingInstanceRecord = marketTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return marketTrackingUpdateActionTaskReference
  **/

  public String getMarketTrackingUpdateActionTaskReference() {
    return marketTrackingUpdateActionTaskReference;
  }

  public void setMarketTrackingUpdateActionTaskReference(String marketTrackingUpdateActionTaskReference) {
    this.marketTrackingUpdateActionTaskReference = marketTrackingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return marketTrackingUpdateActionTaskRecord
  **/

  public Object getMarketTrackingUpdateActionTaskRecord() {
    return marketTrackingUpdateActionTaskRecord;
  }

  public void setMarketTrackingUpdateActionTaskRecord(Object marketTrackingUpdateActionTaskRecord) {
    this.marketTrackingUpdateActionTaskRecord = marketTrackingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

