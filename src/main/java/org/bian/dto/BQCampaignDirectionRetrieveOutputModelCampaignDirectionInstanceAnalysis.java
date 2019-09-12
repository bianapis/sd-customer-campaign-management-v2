package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceAnalysis
 */
public class BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceAnalysis   {
  private Object campaignDirectionInstanceAnalysisRecord = null;

  private String campaignDirectionInstanceAnalysisReportType = null;

  private String campaignDirectionInstanceAnalysisParameters = null;

  private Object campaignDirectionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return campaignDirectionInstanceAnalysisRecord
  **/

  public Object getCampaignDirectionInstanceAnalysisRecord() {
    return campaignDirectionInstanceAnalysisRecord;
  }

  public void setCampaignDirectionInstanceAnalysisRecord(Object campaignDirectionInstanceAnalysisRecord) {
    this.campaignDirectionInstanceAnalysisRecord = campaignDirectionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return campaignDirectionInstanceAnalysisReportType
  **/

  public String getCampaignDirectionInstanceAnalysisReportType() {
    return campaignDirectionInstanceAnalysisReportType;
  }

  public void setCampaignDirectionInstanceAnalysisReportType(String campaignDirectionInstanceAnalysisReportType) {
    this.campaignDirectionInstanceAnalysisReportType = campaignDirectionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return campaignDirectionInstanceAnalysisParameters
  **/

  public String getCampaignDirectionInstanceAnalysisParameters() {
    return campaignDirectionInstanceAnalysisParameters;
  }

  public void setCampaignDirectionInstanceAnalysisParameters(String campaignDirectionInstanceAnalysisParameters) {
    this.campaignDirectionInstanceAnalysisParameters = campaignDirectionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return campaignDirectionInstanceAnalysisReport
  **/

  public Object getCampaignDirectionInstanceAnalysisReport() {
    return campaignDirectionInstanceAnalysisReport;
  }

  public void setCampaignDirectionInstanceAnalysisReport(Object campaignDirectionInstanceAnalysisReport) {
    this.campaignDirectionInstanceAnalysisReport = campaignDirectionInstanceAnalysisReport;
  }


}

