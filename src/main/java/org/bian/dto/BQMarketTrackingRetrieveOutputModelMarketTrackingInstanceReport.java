package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceReport
 */
public class BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceReport   {
  private Object marketTrackingInstanceReportRecord = null;

  private String marketTrackingInstanceReportType = null;

  private String marketTrackingInstanceReportParameters = null;

  private Object marketTrackingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return marketTrackingInstanceReportRecord
  **/

  public Object getMarketTrackingInstanceReportRecord() {
    return marketTrackingInstanceReportRecord;
  }

  public void setMarketTrackingInstanceReportRecord(Object marketTrackingInstanceReportRecord) {
    this.marketTrackingInstanceReportRecord = marketTrackingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return marketTrackingInstanceReportType
  **/

  public String getMarketTrackingInstanceReportType() {
    return marketTrackingInstanceReportType;
  }

  public void setMarketTrackingInstanceReportType(String marketTrackingInstanceReportType) {
    this.marketTrackingInstanceReportType = marketTrackingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return marketTrackingInstanceReportParameters
  **/

  public String getMarketTrackingInstanceReportParameters() {
    return marketTrackingInstanceReportParameters;
  }

  public void setMarketTrackingInstanceReportParameters(String marketTrackingInstanceReportParameters) {
    this.marketTrackingInstanceReportParameters = marketTrackingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return marketTrackingInstanceReport
  **/

  public Object getMarketTrackingInstanceReport() {
    return marketTrackingInstanceReport;
  }

  public void setMarketTrackingInstanceReport(Object marketTrackingInstanceReport) {
    this.marketTrackingInstanceReport = marketTrackingInstanceReport;
  }


}

