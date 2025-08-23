-- Last updated: 8/23/2025, 6:49:38 PM
SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions REGEXP '(^| )DIAB1';