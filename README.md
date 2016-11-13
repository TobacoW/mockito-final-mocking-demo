# mockito-final-mocking-demo
A demo of incubating feature of Mockit 2.x that lat you mock final classes/methods: https://github.com/mockito/mockito/wiki/What%27s-new-in-Mockito-2#unmockable

## Performance of org.mockito:mockito-core:2.2.15
### Mockito experimental final mocking DISABLED
Test | Run 1 | Run 2 | Run 3 | Run 4 | Run 5 | Run 6 | Run 7 | Run 8 | Run 9 | Run 10 | Average (ms)
------------ | -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:
nonFinalClass_nonFinalMethod | 440 | 396 | 426 | 380 | 397 | 394 | 403 | 383 | 388 | 396 | 400

### Mockito experimental final mocking ENABLED
Test | Run 1 | Run 2 | Run 3 | Run 4 | Run 5 | Run 6 | Run 7 | Run 8 | Run 9 | Run 10 | Average (ms)
------------ | -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:| -------------:
nonFinalClass_nonFinalMethod | 1059 | 1081 | 1297 | 911 | 1296 | 1234 | 1377 | 933 | 1075 | 962 | 1123
nonFinalClass_finalMethod | 984 | 1219 | 1800 | 991 | 1162 | 982 | 949 | 1570 | 996 | 1150 | 1180
finalClass_nonFinalMethod | 1008 | 978 | 980 | 1021 | 1233 | 1002 | 1095 | 1044 | 1476 | 976 | 1081
finalClass_finalMethod | 1197 | 1160 | 1066 | 978 | 1005 | 1275 | 1157 | 1027 | 1074 | 1057 | 1100

