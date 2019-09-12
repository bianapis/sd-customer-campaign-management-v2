package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceAnalysis;
import org.bian.dto.BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceRecord;
import org.bian.dto.BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingRetrieveOutputModel
 */
public class BQMarketTrackingRetrieveOutputModel   {
  private BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord = null;

  private String marketTrackingRetrieveActionTaskReference = null;

  private Object marketTrackingRetrieveActionTaskRecord = null;

  private String marketTrackingRetrieveActionResponse = null;

  private BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceReport marketTrackingInstanceReport = null;

  private BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceAnalysis marketTrackingInstanceAnalysis = null;


  /**
   * Get marketTrackingInstanceRecord
   * @return marketTrackingInstanceRecord
  **/

  public BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceRecord getMarketTrackingInstanceRecord() {
    return marketTrackingInstanceRecord;
  }

  public void setMarketTrackingInstanceRecord(BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord) {
    this.marketTrackingInstanceRecord = marketTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Market Tracking instance retrieve service call 
   * @return marketTrackingRetrieveActionTaskReference
  **/

  public String getMarketTrackingRetrieveActionTaskReference() {
    return marketTrackingRetrieveActionTaskReference;
  }

  public void setMarketTrackingRetrieveActionTaskReference(String marketTrackingRetrieveActionTaskReference) {
    this.marketTrackingRetrieveActionTaskReference = marketTrackingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return marketTrackingRetrieveActionTaskRecord
  **/

  public Object getMarketTrackingRetrieveActionTaskRecord() {
    return marketTrackingRetrieveActionTaskRecord;
  }

  public void setMarketTrackingRetrieveActionTaskRecord(Object marketTrackingRetrieveActionTaskRecord) {
    this.marketTrackingRetrieveActionTaskRecord = marketTrackingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return marketTrackingRetrieveActionResponse
  **/

  public String getMarketTrackingRetrieveActionResponse() {
    return marketTrackingRetrieveActionResponse;
  }

  public void setMarketTrackingRetrieveActionResponse(String marketTrackingRetrieveActionResponse) {
    this.marketTrackingRetrieveActionResponse = marketTrackingRetrieveActionResponse;
  }


  /**
   * Get marketTrackingInstanceReport
   * @return marketTrackingInstanceReport
  **/

  public BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceReport getMarketTrackingInstanceReport() {
    return marketTrackingInstanceReport;
  }

  public void setMarketTrackingInstanceReport(BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceReport marketTrackingInstanceReport) {
    this.marketTrackingInstanceReport = marketTrackingInstanceReport;
  }


  /**
   * Get marketTrackingInstanceAnalysis
   * @return marketTrackingInstanceAnalysis
  **/

  public BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceAnalysis getMarketTrackingInstanceAnalysis() {
    return marketTrackingInstanceAnalysis;
  }

  public void setMarketTrackingInstanceAnalysis(BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceAnalysis marketTrackingInstanceAnalysis) {
    this.marketTrackingInstanceAnalysis = marketTrackingInstanceAnalysis;
  }


}

