/*Task 4: File Storage System with @Profile

Step 1: Model Class

FileData
Fields:

fileName
size
Step 2: Interface

StorageService
Method:

store(FileData file)
Step 3: Profile-Based Implementations

Dev Profile

LocalStorageService
Prints → "Storing file locally: <fileName>"

Test Profile

TempStorageService
Prints → "Storing file in temp storage"

Prod Profile

CloudStorageService
Prints → "Uploading file to cloud"
Step 4: FileStorageRunner
Store one file
*/
