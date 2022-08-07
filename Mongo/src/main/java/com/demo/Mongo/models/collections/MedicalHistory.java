package com.demo.Mongo.models.collections;

import com.demo.Mongo.models.LabRecords;
import com.demo.Mongo.models.RadiologyRecords;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document("Medical_History")
public class MedicalHistory {
    @Id
    private String _id;
    private List<LabRecords> Lab_Records;
    private List<RadiologyRecords> Radiology_Records;
    private String Allergies;
    private String Stage;
    public MedicalHistory(){}

    public MedicalHistory(String Allergies,String Stage,List<LabRecords> Lab_Records,List<RadiologyRecords> Radiology_Records){
        this.Allergies = Allergies;
        this.Stage = Stage;
        this.Lab_Records = Lab_Records;
        this.Radiology_Records = Radiology_Records;
    }
    public MedicalHistory(String _id,String Allergies,String Stage,List<LabRecords> Lab_Records,List<RadiologyRecords> Radiology_Records){
        this._id = _id;
        this.Lab_Records = Lab_Records;
        this.Radiology_Records = Radiology_Records;
        this.Allergies = Allergies;
        this.Stage = Stage;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public List<LabRecords> getLab_Records() {
        return Lab_Records;
    }

    public void setLab_Records(List<LabRecords> lab_Records) {
        Lab_Records = lab_Records;
    }

    public List<RadiologyRecords> getRadiology_Records() {
        return Radiology_Records;
    }

    public void setRadiology_Records(List<RadiologyRecords> radiology_Records) {
        Radiology_Records = radiology_Records;
    }

    public void setAllergies(String allergies) {
        this.Allergies = allergies;
    }

}

