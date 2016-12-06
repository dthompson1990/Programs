/**
 * @Author Ricky Clevinger
 * HomeActivity.java
 */

package ricky.bookcomparison;

import android.content.Intent;
import android.database.CursorIndexOutOfBoundsException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    String ISBN;
    EditText ISBNedit;
    String Radprice;
    String Redprice;
    String Amaprice;
    String BookTitle;
    Spinner semesterSpinner;
    Spinner departmentSpinner;
    Spinner courseSpinner;
    Spinner sectionSpinner;
    ArrayAdapter<CharSequence> semesterAdapter;
    ArrayAdapter<CharSequence> departmentAdapter;
    ArrayAdapter<CharSequence> courseAdapter;
    ArrayAdapter<CharSequence> sectionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        semesterSpinner = (Spinner) findViewById(R.id.Semester);
        departmentSpinner = (Spinner) findViewById(R.id.Department);
        courseSpinner = (Spinner) findViewById(R.id.Number);
        sectionSpinner = (Spinner) findViewById(R.id.Section);
        ISBNedit = (EditText) findViewById(R.id.ISBNEditText);

        semesterAdapter = ArrayAdapter.createFromResource(this, R.array.semester_names, android.R.layout.simple_spinner_item);
        semesterAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        semesterSpinner.setAdapter(semesterAdapter);
        semesterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(0)){
                    departmentAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MaymesterDepartments, android.R.layout.simple_spinner_item);
                    departmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    departmentSpinner.setAdapter(departmentAdapter);
                }

                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(1)){
                    departmentAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.Summer_I_Departments, android.R.layout.simple_spinner_item);
                    departmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    departmentSpinner.setAdapter(departmentAdapter);
                }

                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(2)){
                    departmentAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.Summer_II_Departments, android.R.layout.simple_spinner_item);
                    departmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    departmentSpinner.setAdapter(departmentAdapter);
                }

                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(3)){
                    departmentAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.Summer_III_Departments, android.R.layout.simple_spinner_item);
                    departmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    departmentSpinner.setAdapter(departmentAdapter);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        departmentAdapter = ArrayAdapter.createFromResource(this, R.array.MaymesterDepartments, android.R.layout.simple_spinner_item);
        departmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        departmentSpinner.setAdapter(departmentAdapter);
        departmentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(0) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)){
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayACTG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(1) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayART, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(2) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayARTS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(3) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayATTR, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(4) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayBIOL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(5) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayBLAW, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(6) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayCOMS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(7) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayCOSD, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(8) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayCRJU, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(9) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayCVPA, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(10) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayDSN, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(11) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayDNCE, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(12) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayECON, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(13) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayEDRD, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(14) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayEDSP, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(15) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayEDUC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(16) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayENGL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(17) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayESHE, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(18) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayGEOL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(19) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayGEOS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(20) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayHIST, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(21) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayHLTH, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(22) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayMATH, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(23) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayMGNT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(24) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayMUSC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(25) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayNURS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(26) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayPEAC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(27) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayPOSC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(28) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayPSYC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(29) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayRCPT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(30) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MaYSOCY, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(31) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MaySOWK, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(32) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MaySTAT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(33) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.MayTHEA, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }











                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(0) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_ACTG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(1) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_APST, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(2) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_ARTS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(3) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_ASTR, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(4) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_ATTR, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(5) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_BIOL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(6) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_CHEM, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(7) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_COED, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(8) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_COMS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(9) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_CORE, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(10) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_DSN, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(11) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_ECON, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(12) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_EDEF, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(13) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_EDET, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(14) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_EDSP, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(15) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_EDUC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(16) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_ENGL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(17) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_ESHE, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(18) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_FINC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(19) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_GEOG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(20) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_HIST, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(21) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_HLTH, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(22) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_HUMD, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(23) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_IDST, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(24) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_ITEC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(25) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_MATH, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(26) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_MGNT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(27) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_MKTG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(28) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_NUTR, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(29) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_PHYS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(30) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_POSC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(31) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_PSYC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(32) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_RELN, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(33) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_SOCY, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(34) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_SOWK, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(35) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_STAT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(36) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_THEA, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }









                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(0) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerI_ACTG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(1) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_ANSC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(2) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_APST, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(3) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_ART, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(4) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_ARTH, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(5) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_ARTS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(6) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_ASTR, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(7) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_BIOL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(8) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_CHEM, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(9) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_COED, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(10) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_COMS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(11) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_CORE, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(12) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_CRJU, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(13) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_DSN, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(14) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_ECON, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(15) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_EDEF, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(16) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_EDET, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(17) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_EDSP, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(18) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_EDUC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(19) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_ENGL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(20) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_ESHE, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(21) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_FINC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(22) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_GEOG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(23) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_GEOL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(24) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_HIST, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(25) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_HLTH, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(26) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_INST, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(27) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_ITEC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(28) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_MGNT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(29) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_MKTG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(30) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_MUSC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(31) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_PHYS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(32) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_POSC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(33) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_PSYC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(34) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_SOCY, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(35) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_SOWK, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(36) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_STAT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(37) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerII_THEA, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }









                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(0) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_ACTG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(1) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_AHPT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(2) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_ART, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(3) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_ARTG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(4) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_BIOL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(5) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_COED, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(6) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_COMS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(7) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_CORE, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(8) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_COSD, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(9) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_DSN, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(10) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_DSNF, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(11) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_DSNI, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(12) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_DSNM, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(13) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_ECON, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(14) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_EDEL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(15) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_EDRD, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(16) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_ENGL, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(17) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_ESHE, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(18) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_HLTH, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(19) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_IDST, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(20) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_ITEC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(21) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_MGNT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(22) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_MKTG, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(23) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_NURS, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(24) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_OCTH, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(25) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_POSC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(26) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_PSYC, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(27) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_RCPT, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }
                if (parent.getItemAtPosition(position) == parent.getItemAtPosition(28) && semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3)) {
                    courseAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.SummerIII_SOWK, android.R.layout.simple_spinner_item);
                    courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    courseSpinner.setAdapter(courseAdapter);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        courseAdapter = ArrayAdapter.createFromResource(this, R.array.MayACTG, android.R.layout.simple_spinner_item);
        courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        courseSpinner.setAdapter(courseAdapter);
        courseSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(0) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(4) && parent.getSelectedItem() == parent.getItemAtPosition(0) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount2, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(9) && parent.getSelectedItem() == parent.getItemAtPosition(0) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount3, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ((semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(12) && parent.getSelectedItem() == parent.getItemAtPosition(2)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(13) && parent.getSelectedItem() == parent.getItemAtPosition(2)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(15) && parent.getSelectedItem() == parent.getItemAtPosition(1))||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(26) && parent.getSelectedItem() == parent.getItemAtPosition(2)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(26) && parent.getSelectedItem() == parent.getItemAtPosition(4))) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount2, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(1) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(24) && parent.getSelectedItem() == parent.getItemAtPosition(0) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount10, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(11) && parent.getSelectedItem() == parent.getItemAtPosition(1) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount4, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ((semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(12) && parent.getSelectedItem() == parent.getItemAtPosition(2)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(15) && parent.getSelectedItem() == parent.getItemAtPosition(1)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(16) && parent.getSelectedItem() == parent.getItemAtPosition(0))||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(17) && parent.getSelectedItem() == parent.getItemAtPosition(4)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(21) && parent.getSelectedItem() == parent.getItemAtPosition(0)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(28) && parent.getSelectedItem() == parent.getItemAtPosition(4))||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(28) && parent.getSelectedItem() == parent.getItemAtPosition(5))) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount2, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(2) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(27) && parent.getSelectedItem() == parent.getItemAtPosition(0) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount10, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(8) && parent.getSelectedItem() == parent.getItemAtPosition(0) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount25, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(6) && parent.getSelectedItem() == parent.getItemAtPosition(9) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount25, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(9) && parent.getSelectedItem() == parent.getItemAtPosition(0) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount3, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(17) && parent.getSelectedItem() == parent.getItemAtPosition(2) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount4, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(20) && parent.getSelectedItem() == parent.getItemAtPosition(0)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(20) && parent.getSelectedItem() == parent.getItemAtPosition(1))) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount11, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(23) && parent.getSelectedItem() == parent.getItemAtPosition(9)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(23) && parent.getSelectedItem() == parent.getItemAtPosition(11)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(23) && parent.getSelectedItem() == parent.getItemAtPosition(14))) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount3, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(28) && parent.getSelectedItem() == parent.getItemAtPosition(0) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount3, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(28) && parent.getSelectedItem() == parent.getItemAtPosition(1) ) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount1_3, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else if ( (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(2) && parent.getSelectedItem() == parent.getItemAtPosition(3)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(5) && parent.getSelectedItem() == parent.getItemAtPosition(4)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(5) && parent.getSelectedItem() == parent.getItemAtPosition(6)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(5) && parent.getSelectedItem() == parent.getItemAtPosition(7)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(5) && parent.getSelectedItem() == parent.getItemAtPosition(8)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(6) && parent.getSelectedItem() == parent.getItemAtPosition(5)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(14) && parent.getSelectedItem() == parent.getItemAtPosition(1)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(14) && parent.getSelectedItem() == parent.getItemAtPosition(2)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(23) && parent.getSelectedItem() == parent.getItemAtPosition(10)) ||
                        (semesterSpinner.getSelectedItem() == semesterSpinner.getItemAtPosition(3) && departmentSpinner.getSelectedItem() == departmentSpinner.getItemAtPosition(24) && parent.getSelectedItem() == parent.getItemAtPosition(1))) {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount2, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }
                else
                {
                    sectionAdapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.secAmount1, android.R.layout.simple_spinner_item);
                    sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    sectionSpinner.setAdapter(sectionAdapter);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        sectionAdapter = ArrayAdapter.createFromResource(this, R.array.secAmount1, android.R.layout.simple_spinner_item);
        sectionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sectionSpinner.setAdapter(sectionAdapter);
        sectionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void openSearchActivity1(View view) {

        Intent intent = new Intent(this, SearchActivity.class);

        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        //price = (databaseAccess.getISBN2("Maymester", "COSD", "635", "1" ));
        Radprice = (databaseAccess.getRadNewPrice(semesterSpinner.getSelectedItem().toString(), departmentSpinner.getSelectedItem().toString(), courseSpinner.getSelectedItem().toString(), sectionSpinner.getSelectedItem().toString()));
        Redprice = (databaseAccess.getRedNewPrice(semesterSpinner.getSelectedItem().toString(), departmentSpinner.getSelectedItem().toString(), courseSpinner.getSelectedItem().toString(), sectionSpinner.getSelectedItem().toString()));
        Amaprice = (databaseAccess.getAmaNewPrice(semesterSpinner.getSelectedItem().toString(), departmentSpinner.getSelectedItem().toString(), courseSpinner.getSelectedItem().toString(), sectionSpinner.getSelectedItem().toString()));
        BookTitle = (databaseAccess.getTitle(semesterSpinner.getSelectedItem().toString(), departmentSpinner.getSelectedItem().toString(), courseSpinner.getSelectedItem().toString(), sectionSpinner.getSelectedItem().toString()));
        ISBN = (databaseAccess.getISBN(semesterSpinner.getSelectedItem().toString(), departmentSpinner.getSelectedItem().toString(), courseSpinner.getSelectedItem().toString(), sectionSpinner.getSelectedItem().toString()));
        databaseAccess.close();

        intent.putExtra("message", Radprice);
        intent.putExtra("message2", Redprice);
        intent.putExtra("message3", Amaprice);
        intent.putExtra("message4", BookTitle);
        intent.putExtra("message5", ISBN);
        startActivity(intent);



    }

    public void openSearchActivity(View view) {
        try{

        Intent intent = new Intent(this, SearchActivity.class);
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        Radprice =  (databaseAccess.getRadNewPriceISBN(ISBNedit.getText().toString()));
        Redprice =  (databaseAccess.getRedNewPriceISBN(ISBNedit.getText().toString()));
        Amaprice =  (databaseAccess.getAmaNewPriceISBN(ISBNedit.getText().toString()));
        BookTitle = (databaseAccess.getTitleISBN(ISBNedit.getText().toString()));
        ISBN = (databaseAccess.getISBNISBN(ISBNedit.getText().toString()));
        databaseAccess.close();

        intent.putExtra("message", Radprice);
        intent.putExtra("message2", Redprice);
        intent.putExtra("message3", Amaprice);
        intent.putExtra("message4", BookTitle);
        intent.putExtra("message5", ISBN);
        startActivity(intent);}
        catch (CursorIndexOutOfBoundsException e){
            Toast.makeText(getBaseContext(), "Invalid ISBN entered",
                    Toast.LENGTH_LONG).show();
        }
    }


    public void openLoginActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void openScheduleActivity(View view) {
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
    }


    public void closeApp(View view) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("Exit me", true);
        startActivity(intent);
        finish();
    }




}
