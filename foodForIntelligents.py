from twilio.rest import TwilioRestClient
import urllib
import time
import sys


def read_text():
    current_time = 0
    loop_limit = 10000
    while(current_time < loop_limit):
       time.sleep(1)
       quotes = open(r"D:\Projects Extras\foodForIntelligents.txt",'r')
       contents_of_file = quotes.read()
       a,b,c=contents_of_file.split()
       #print(contents_of_file)
       if "1"  in a:
          print(b)
          print(c)
           
          account_sid = "##" 
          auth_token  = "##" 

          client = TwilioRestClient(account_sid, auth_token)

          message = client.messages.create(body="Hey, Thank You for showing intrest in **Food For Intelligents** . Your OTP is "+b+".",
          to="+91"+c,   
          from_="+13347814842") 

          print(message.sid)
          
          time.sleep(70)
       else:
          print("Not Connecting")
          
       current_time+=1   
        
       quotes.close()    
        
     

read_text()
    
