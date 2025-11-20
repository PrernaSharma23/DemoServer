# server-service/app.py
from fastapi import FastAPI

app = FastAPI(title="Server Microservice")

# --- SERVER: Core data provider ---
mock_users = {
    1: {"id": 1, "name": "Alice", "email": "alice@example.com"},
    2: {"id": 2, "name": "Bob", "email": "bob@example.com"},
}


@app.get("/user/{user_id}")
def get_user(user_id: int):
    user = mock_users.get(user_id)
    if not user:
        return {"error": "User not found"}

    return user
