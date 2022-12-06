# 6. Create a student database in MongoDB with all the details of students of a class

```bash
> show dbs
```
admin   0.000GB

config  0.000GB

local   0.000GB

```bash
> use studentinfo
```
switched to db studentinfo

```bash
>db.studentinfo.insert({name:"john",id:"20bd1a05051",course:"b.tech",branch:"cse"})
WriteResult({ "nInserted" : 1 })
```

```bash
>db.studentinfo.insert({name:"reena",id:"20bd1a0502",course:"M.tech",branch:"it"})
WriteResult({ "nInserted" : 1 })
```

```bash
>db.studentinfo.insert({name:"ram",id:"20bd1a0503",course:"b.tech",branch:"cse"})
WriteResult({ "nInserted" : 1 })
```

```bash
>db.studentinfo.find({})
{ "_id" : ObjectId("638f7dbb8460d32498737263"), "name" : "john", "id" : "20bd1a05051", "course" : "b.tech", "branch" : "cse" }
{ "_id" : ObjectId("638f7dc08460d32498737264"), "name" : "reena", "id" : "20bd1a0502", "course" : "M.tech", "branch" : "it" }
{ "_id" : ObjectId("638f7dc48460d32498737265"), "name" : "ram", "id" : "20bd1a0503", "course" : "b.tech", "branch" : "cse" }
```
