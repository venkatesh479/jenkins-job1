import boto3
import sys
region=sys.argv[1]
accesskey=sys.argv[2]
secretkey=sys.argv[3]

client=boto3.client('ec2',region_name=region,aws_access_key_id=accesskey,aws_secret_access_key=secretkey)

data1 = client.describe_instance()
for data2 n data1["Reservations"]:
      for data3 in data2["Instances"]:
      print(data13)
