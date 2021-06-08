# Create Deployment from Cloud Storage Trigger

gcloud functions deploy hello_gcs \
--runtime python37 \
--trigger-resource user_voice_input \
--trigger-event google.storage.object.finalize
