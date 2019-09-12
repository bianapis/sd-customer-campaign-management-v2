package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingRetrieveInputModelMarketTrackingInstanceAnalysis;
import org.bian.dto.BQMarketTrackingRetrieveInputModelMarketTrackingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingRetrieveInputModel
 */
public class BQMarketTrackingRetrieveInputModel   {
  private Object marketTrackingRetrieveActionTaskRecord = null;

  private String marketTrackingRetrieveActionRequest = null;

  private BQMarketTrackingRetrieveInputModelMarketTrackingInstanceReport marketTrackingInstanceReport = null;

  private BQMarketTrackingRetrieveInputModelMarketTrackingInstanceAnalysis marketTrackingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return marketTrackingRetrieveActionRequest
  **/

  public String getMarketTrackingRetrieveActionRequest() {
    return marketTrackingRetrieveActionRequest;
  }

  public void setMarketTrackingRetrieveActionRequest(String marketTrackingRetrieveActionRequest) {
    this.marketTrackingRetrieveActionRequest = marketTrackingRetrieveActionRequest;
  }


  /**
   * Get marketTrackingInstanceReport
   * @return marketTrackingInstanceReport
  **/

  public BQMarketTrackingRetrieveInputModelMarketTrackingInstanceReport getMarketTrackingInstanceReport() {
    return marketTrackingInstanceReport;
  }

  public void setMarketTrackingInstanceReport(BQMarketTrackingRetrieveInputModelMarketTrackingInstanceReport marketTrackingInstanceReport) {
    this.marketTrackingInstanceReport = marketTrackingInstanceReport;
  }


  /**
   * Get marketTrackingInstanceAnalysis
   * @return marketTrackingInstanceAnalysis
  **/

  public BQMarketTrackingRetrieveInputModelMarketTrackingInstanceAnalysis getMarketTrackingInstanceAnalysis() {
    return marketTrackingInstanceAnalysis;
  }

  public void setMarketTrackingInstanceAnalysis(BQMarketTrackingRetrieveInputModelMarketTrackingInstanceAnalysis marketTrackingInstanceAnalysis) {
    this.marketTrackingInstanceAnalysis = marketTrackingInstanceAnalysis;
  }


}

