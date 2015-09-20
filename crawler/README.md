periodically started by the backend -- this will start a python crawler. 
python crawler will do the following:
1. crawl given website(s) and pull data..
once a product is pulled, its stored in db and indexed at the es
- the product should first be constructed into a json
- we will store this in mongodb

thats all -- do this for all pulled documents. 
when the process exits, java process should know about its exit. 

