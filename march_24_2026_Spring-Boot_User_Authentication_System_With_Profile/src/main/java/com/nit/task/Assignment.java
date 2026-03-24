/*Task 3: User Authentication System with @Profile

Step 1: Model Class

User
Fields:

username
password
Step 2: Interface

AuthService
Method:

authenticate(User user)
Step 3: Profile-Based Implementations

Dev Profile

DummyAuthService
Always returns success

Test Profile

OTPAuthService
Prints → "OTP sent to user"

Prod Profile

DatabaseAuthService
Prints → "Validating user from DB"
Step 4: UserRunner
Pass user details
Call authenticate()
*/