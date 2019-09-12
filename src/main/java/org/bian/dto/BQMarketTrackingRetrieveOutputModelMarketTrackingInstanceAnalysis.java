package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceAnalysis
 */
public class BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceAnalysis   {
  private Object marketTrackingInstanceAnalysisRecord = null;

  private String marketTrackingInstanceAnalysisReportType = null;

  private String marketTrackingInstanceAnalysisParameters = null;

  private Object marketTrackingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return marketTrackingInstanceAnalysisRecord
  **/

  public Object getMarketTrackingInstanceAnalysisRecord() {
    return marketTrackingInstanceAnalysisRecord;
  }

  public void setMarketTrackingInstanceAnalysisRecord(Object marketTrackingInstanceAnalysisRecord) {
    this.marketTrackingInstanceAnalysisRecord = marketTrackingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return marketTrackingInstanceAnalysisReportType
  **/

  public String getMarketTrackingInstanceAnalysisReportType() {
    return marketTrackingInstanceAnalysisReportType;
  }

  public void setMarketTrackingInstanceAnalysisReportType(String marketTrackingInstanceAnalysisReportType) {
    this.marketTrackingInstanceAnalysisReportType = marketTrackingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return marketTrackingInstanceAnalysisParameters
  **/

  public String getMarketTrackingInstanceAnalysisParameters() {
    return marketTrackingInstanceAnalysisParameters;
  }

  public void setMarketTrackingInstanceAnalysisParameters(String marketTrackingInstanceAnalysisParameters) {
    this.marketTrackingInstanceAnalysisParameters = marketTrackingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return marketTrackingInstanceAnalysisReport
  **/

  public Object getMarketTrackingInstanceAnalysisReport() {
    return marketTrackingInstanceAnalysisReport;
  }

  public void setMarketTrackingInstanceAnalysisReport(Object marketTrackingInstanceAnalysisReport) {
    this.marketTrackingInstanceAnalysisReport = marketTrackingInstanceAnalysisReport;
  }


}

