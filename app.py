from fastapi import FastAPI
from controller.user_controller import router as user_router
from controller.health_controller import router as health_router

app = FastAPI(title="Server Microservice")

# user endpoints under /user
app.include_router(user_router, prefix="/user", tags=["User"])
# health endpoints at root /health
app.include_router(health_router, prefix="", tags=["Health"])
